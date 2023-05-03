package com.Book.Application.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Book.Application.modal.*;
import com.Book.Application.service.UserService;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/loginForm")
    public String loginForm() {
    	
       
        return "login";
    }
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
	    
	    request.getSession().invalidate();
	    
	    return "redirect:/loginForm";
	}
    
   
    
    @RequestMapping("/logIntoSystem")
    public String logIntoSystem(@RequestParam("uname") String uname, @RequestParam("psw") String pass,Model modal) {
    	
    	List<com.Book.Application.modal.User> users=userService.getAllUsers();
    	
    	for(com.Book.Application.modal.User u: users) {
    		
    		if(u.getUserName().equalsIgnoreCase(uname) && u.getPassword().equalsIgnoreCase(pass)) {
    			return "HomePage";
    		}
    	}
    	
    	modal.addAttribute("Status","Invalid user name and password");
    	return "login";
    }
    
    
    @RequestMapping("/home")
    public String home() {
    	System.out.println("Home method called");
       
        return "index";
    }
}
