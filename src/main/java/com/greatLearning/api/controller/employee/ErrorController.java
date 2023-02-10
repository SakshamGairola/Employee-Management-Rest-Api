package com.greatLearning.api.controller.employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ErrorController {

    @RequestMapping("/error/403")
    public String error(){
        return "Not accessible";
    }
}
