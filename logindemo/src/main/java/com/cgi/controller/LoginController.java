package com.cgi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
     @RequestMapping("/")
        public String dispIndex() {
            return "login";
        }
     
      @RequestMapping("/login")
        public String login(Model model, @RequestParam String username, @RequestParam String password) {
           
            if ((username.equals("admin")) && (password.equals("admin"))) {
               
                return "disp";
            } else {
                      
           return "error";
   }
}
}
