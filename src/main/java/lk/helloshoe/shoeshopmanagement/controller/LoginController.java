package lk.helloshoe.shoeshopmanagement.controller;

import lk.helloshoe.shoeshopmanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(path="/login")
    public String getWelcomePage(){
        return "login.html";
    }



}
