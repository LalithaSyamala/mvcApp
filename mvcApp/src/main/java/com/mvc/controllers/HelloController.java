package com.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mvc.Dao.EmpDao;
import com.mvc.entity.EmpEntity;

@Controller
public class HelloController 
{
	@Autowired
	private EmpDao empDao;
	
	@RequestMapping(value="/addEmp")
	public int addEmpDetails(@RequestBody EmpEntity empEntity) {
		
		return empDao.saveEmp(empEntity);
		
	}
	
}
