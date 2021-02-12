package com.vidyadisha.service;

public interface LoginService {
    public boolean validateUser(String user);
    public boolean login(String user,String password);
}
