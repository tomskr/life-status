package pl.tomskr.lifestatus.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = {"","/"})
    public String sayMain(){
        return "Main";
    }

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
