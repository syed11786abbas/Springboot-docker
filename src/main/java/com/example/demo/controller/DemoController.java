package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ServiceInterface;

@RestController


public class DemoController {
	@Autowired
	 ServiceInterface servicedocinterface;
	@GetMapping("/cool/{value}")
	
	public String getMsg(@PathVariable String value) {
		return this.servicedocinterface.getMsg();
	}
}
