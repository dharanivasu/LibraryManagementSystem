package com.Book.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Book.Application.modal.*;



public interface ChildBookRepo extends JpaRepository<ChildrenBooks, Integer>{

}
