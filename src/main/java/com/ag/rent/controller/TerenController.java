package com.ag.rent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rent.domain.Teren;
import com.ag.rent.service.TerenService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TerenController {

	@Autowired
	private TerenService terenService;
	
	@GetMapping("/terenuri")
	public List<Teren> getAllTerenuri(){
		return terenService.getAllTerenuri();
	}
	
	@GetMapping("teren/{oras}/{sport}")
	public List<Teren> getTerenByOrasAndSport(@PathVariable String oras, @PathVariable String sport){
		return terenService.searchByOrasAndSport(oras, sport);
	}
	
	@GetMapping("teren/{id}")
	public Optional<Teren> getTerenByID(@PathVariable long id) {
		return this.terenService.getTerenByID(id);
	}
}
