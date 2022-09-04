package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
@RequestMapping("/wzq")
public class HelloController {

    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello wzq");
    }
}
