package com.ag.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rent.domain.Sport;
import com.ag.rent.service.SportService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/sport")
public class SportController {

	@Autowired
	private SportService sportService;
	
	@GetMapping
	public List<Sport> getAllSports(){
		return this.sportService.getAllSports();
	}
}
