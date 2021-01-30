package com.vidyadisha.service;

import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements LoginService{
    public boolean validateUser(String user){
        if("admin".equals(user)){
            return true;
        }
        return false;
    }
}
