package lk.helloshoe.shoeshopmanagement.controller;

import lk.helloshoe.shoeshopmanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String getLoginPage(){
        return "login.html";
    }

    @GetMapping("/index")
    public ModelAndView getIndexPage(){
        return new ModelAndView("/index");
    }



}
