package org.scoula.weather.controller;

import lombok.extern.slf4j.Slf4j;
import org.scoula.weather.dto.WeatherDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/api/weather")
@PropertySource({"classpath:/application.properties"})
public class WeatherController {

    @Value("${weather.url}")
    private String URL;

    @Value("${weather.icon_url}")
    private String ICON_URL;

    @Value("${weather.api_key}")
    private String API_KEY;

    @GetMapping({"", "/{city}"})
    public ResponseEntity<?> getWeather(@PathVariable(value="city", required = false) String city) {
        city = city == null ? "seoul" : city;
        RestTemplate restTemplate = new RestTemplate();
        String url = UriComponentsBuilder.fromHttpUrl(URL)
                .queryParam("q", city)
                .queryParam("units", "metric")
                .queryParam("APPID", API_KEY)
                .queryParam("lang", "kr")
                .toUriString();

        try {
            WeatherDTO weather = restTemplate.getForObject(url, WeatherDTO.class);

            if (weather == null || weather.getWeather() == null || weather.getWeather().isEmpty()) {
                log.error("No weather data found for city: " + city);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No weather data found");
            }

            String iconUrl = ICON_URL + weather.getWeather().get(0).getIcon() + ".png";
            log.info("오늘의 날씨: " + weather);

            Map<String, Object> response = new HashMap<>();
            response.put("city", city);
            response.put("weather", weather);
            response.put("iconUrl", iconUrl);

            return ResponseEntity.ok(response); // JSON 형태로 반환

        } catch (Exception e) {
            log.error("Error fetching weather data", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error fetching weather data");
        }
    }
}
