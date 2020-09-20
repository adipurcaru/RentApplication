package com.ag.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rent.domain.City;
import com.ag.rent.service.CityService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CityController {

	@Autowired
	private CityService cityService;
	
	@GetMapping("/city")
	public List<City> getAllCities(){
		return this.cityService.getAllSports();
	}
}
