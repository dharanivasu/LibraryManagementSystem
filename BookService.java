package com.Book.Application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Book.Application.modal.*;
import com.Book.Application.repository.ChildBookRepo;
import com.Book.Application.repository.FictionBookRepo;
import com.Book.Application.repository.NonFictionRepo;
import com.Book.Application.repository.YouthBookRepo;

@Service
public class BookService {

	@Autowired
	private ChildBookRepo chidRepo;
	
	@Autowired
	private FictionBookRepo fictionRepo;
	@Autowired
	private NonFictionRepo nonFictionRepo;
	@Autowired
	private YouthBookRepo youthBookRepo;
	
	public List<ChildrenBooks> getAllChildBooks(){
		return this.chidRepo.findAll();
	}
	
	public List<FictionBooks> getAllFictionBooks(){
		
		return this.fictionRepo.findAll();
	}
	public List<NonFictionBooks> getAllNonFictionBooks(){
		return this.nonFictionRepo.findAll();
	}
	
	public List<YouthBooks> getAllYouthBooks(){
		return this.youthBookRepo.findAll();
	}
}
