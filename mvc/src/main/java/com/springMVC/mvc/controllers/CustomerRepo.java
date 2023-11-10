package com.springMVC.mvc.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springMVC.mvc.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
