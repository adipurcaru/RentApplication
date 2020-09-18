package com.ag.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rent.domain.Teren;
import com.ag.rent.service.TerenService;



@RestController
public class TerenController {

	@Autowired
	private TerenService terenService;
	
	@GetMapping("/terenuri")
	public List<Teren> getAllTerenuri(){
		return terenService.getAllTerenuri();
	}
}