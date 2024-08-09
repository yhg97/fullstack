package org.scoula.ex03.controller.SampleControlle;


import lombok.extern.log4j.Log4j;
import org.scoula.ex03.dto.SampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sample")
@Log4j
public class SampleController {

    @RequestMapping("") // url: /sample
    public void basic(){
        log.info("basic........");
    }

    @RequestMapping(value = "basic" , method = {RequestMethod.GET,RequestMethod.POST}) // url: /sample
    public void basicGet(){
        log.info("basic........");
    }

    @GetMapping("/basicOnlyGet") // url : /sample/basicOnlyGet
    public void basicGet2(){
        log.info("basic get only get........");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO dto){
        log.info("" + dto);
        return "ex01";
    }
}
