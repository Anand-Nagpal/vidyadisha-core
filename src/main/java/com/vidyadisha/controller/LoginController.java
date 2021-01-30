package com.vidyadisha.controller;


import com.vidyadisha.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/healthCheck")
    public String healthCheck() {
        return "OK";
    }

    @RequestMapping("/checkUser/{id}")
    public String checkUser(@PathVariable String id) {
        if(loginService.validateUser(id)) {
            return "User " + id + " is a Valid USer!";
        }else{
            return "Invalid User";
        }
    }
}
