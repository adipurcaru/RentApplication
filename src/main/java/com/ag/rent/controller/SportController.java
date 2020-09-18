package com.ag.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rent.domain.Sport;
import com.ag.rent.service.SportService;

@RestController
public class SportController {

	@Autowired
	private SportService sportService;
	
	@GetMapping("/sports")
	public List<Sport> getAllSports(){
		return this.sportService.getAllSports();
	}
}
