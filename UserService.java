package com.Book.Application.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Book.Application.modal.*;
import com.Book.Application.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public List<User> getAllUsers(){
		return this.userRepo.findAll();
	}
}
