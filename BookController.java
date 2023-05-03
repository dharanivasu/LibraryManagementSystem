package com.Book.Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.Book.Application.modal.ChildrenBooks;
import com.Book.Application.modal.FictionBooks;
import com.Book.Application.modal.NonFictionBooks;
import com.Book.Application.modal.YouthBooks;
import com.Book.Application.service.BookService;

@Controller
public class BookController {
    
	@Autowired
	private  BookService bookService;
	@RequestMapping("/childBooks")
	@ResponseBody
	public ModelAndView getAllChild(){
		
		ModelAndView modelAndView = new ModelAndView();
        List<ChildrenBooks> books = bookService.getAllChildBooks();
        modelAndView.addObject("books", books);
        modelAndView.setViewName("ChildrenBooks");
        return modelAndView;
				
				
	}
	@RequestMapping("/fictionalBooks")
	@ResponseBody
	public ModelAndView getAllFictional(){
		
		ModelAndView modelAndView = new ModelAndView();
        List<FictionBooks> books = bookService.getAllFictionBooks();
        modelAndView.addObject("books", books);
        modelAndView.setViewName("FictionalBooks");
        return modelAndView;
				
				
	}
	@RequestMapping("/NonFictionalBooks")
	@ResponseBody
	public ModelAndView getAllNonFictional(){
		
		ModelAndView modelAndView = new ModelAndView();
        List<NonFictionBooks> books = bookService.getAllNonFictionBooks();
        modelAndView.addObject("books", books);
        modelAndView.setViewName("NonFictionalBooks");
        return modelAndView;
				
				
	}
	
	@RequestMapping("/YouthBooks")
	@ResponseBody
	public ModelAndView getAllYouth() {
        ModelAndView modelAndView = new ModelAndView();
        List<YouthBooks> books = bookService.getAllYouthBooks();
        modelAndView.addObject("books", books);
        modelAndView.setViewName("YouthBooks");
        return modelAndView;
    }
    
    
    
    
    
}