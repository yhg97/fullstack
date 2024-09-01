<script setup>
import { ref, onMounted } from 'vue';
import weatherApi from '@/api/weatherApi'; // API 모듈을 임포트

// 날씨 데이터를 담을 ref 변수
const weather = ref(null);
const error = ref(null);

// 컴포넌트가 마운트될 때 API 호출
onMounted(async () => {
  try {
    const response = await weatherApi.fetchWeather(); // 기본값 'seoul' 사용
    console.log(response); // API 응답 데이터를 콘솔에 출력하여 확인합니다.
    weather.value = response.weather; // 응답 데이터의 weather 객체에 접근
  } catch (err) {
    error.value = "날씨 데이터를 가져오는 중 오류가 발생했습니다.";
    console.error(err);
  }
});
</script>

<template>
  <div>
    <!-- 로딩 중 상태 -->
    <div v-if="!weather && !error">
      <p>로딩 중...</p>
    </div>

    <!-- 오류 상태 -->
    <div v-if="error">
      <p>{{ error }}</p>
    </div>

    <!-- 날씨 데이터 표시 -->
    <div v-if="weather">
      <p>도시: {{ weather.name }}</p>
      <p v-if="weather.main">현재 온도: {{ weather.main.temp }}°C</p>
      <p v-if="weather.weather && weather.weather[0]">날씨 설명: {{ weather.weather[0].description }}</p>
      <p v-if="weather.wind">바람 속도: {{ weather.wind.speed }} m/s</p>
      <!-- 추가로 표시하고 싶은 다른 데이터가 있다면 여기에 추가 -->
    </div>
  </div>
</template>
