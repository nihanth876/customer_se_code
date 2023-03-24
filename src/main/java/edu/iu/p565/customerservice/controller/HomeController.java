package edu.iu.p565.customerservice.controller;

import org.hibernate.validator.internal.engine.validationcontext.ReturnValueExecutableValidationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {
    @GetMapping
    public String greetings(){
        return "Greetings!";
    }
}
