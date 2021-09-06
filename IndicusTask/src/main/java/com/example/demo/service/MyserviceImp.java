package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Daoprovider;
import com.example.demo.entities.Author;
@Service
public class MyserviceImp implements Myservice {
@Autowired
	private  Daoprovider daoprovider;
	//List<Author> list;
	

public MyserviceImp()
	{
		/*list=new ArrayList<>();
		list.add(new Author(1,"Sagar","Telangre"));
		list.add(new Author(2,"Sagar","Telangre"));
		list.add(new Author(3,"Sagar","Telangre"));
		list.add(new Author(4,"Sagar","Telangre"));
		*/
		
		
	}
	
	
	@Override
	public List<Author> getlist() {
		
		return daoprovider.findAll();
	}

}
