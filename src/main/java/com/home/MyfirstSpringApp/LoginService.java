package com.home.MyfirstSpringApp;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

        public Boolean validate(String username, String password){
            return username.equals("Piotr") && password.equals("1234");

        }
}
