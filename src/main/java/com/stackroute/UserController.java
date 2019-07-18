package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController
{

    @RequestMapping(value = "/" )
    public String login()
    {
        return "login";
    }
    @Autowired
    User user;
    @RequestMapping(value = "/welcome", method= RequestMethod.GET)
    public String user(@RequestParam("userName") String userName,@RequestParam("password") String password, Model model)
    {

        user.setUserName(userName);
        user.setPassword(password);
        String msg="Welcome " +user.getUserName()+ " to stackroute";
        model.addAttribute("msg", msg);
        return "index";
    }
}
