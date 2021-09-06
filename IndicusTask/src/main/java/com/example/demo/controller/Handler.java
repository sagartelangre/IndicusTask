package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Author;
import com.example.demo.service.Myservice;


@RestController
public class Handler {
	@Autowired
	private Myservice myservice;



	
	@GetMapping("/getdetail")
	public List<Author> getlist()
	{
		return this.myservice.getlist();
		
	}
	
	
}
