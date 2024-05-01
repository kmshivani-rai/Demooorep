package com.mavenshipro.shivani.Controller;

import jakarta.servlet.ServletOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@RequestMapping("/")
public class Controllernn {

    @RequestMapping(value = "/demotest" , method = {RequestMethod.GET, RequestMethod.POST})
    public  String getdemtoest(){
        System.out.println("hello im here");
        return "demothlf";
    }
}
