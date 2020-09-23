package com.ag.rent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rent.domain.Field;
import com.ag.rent.service.TerenService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/field")
public class FieldController {

	@Autowired
	private TerenService terenService;
	
	@GetMapping
	public List<Field> getAllTerenuri(){
		return terenService.getAllTerenuri();
	}
	
	@GetMapping("/{oras}/{sport}")
	public List<Field> getTerenByOrasAndSport(@PathVariable long oras, @PathVariable long sport){
		return terenService.searchByOrasAndSport(oras, sport);
	}
	
	@GetMapping("/{id}")
	public Optional<Field> getTerenByID(@PathVariable long id) {
		return this.terenService.getTerenByID(id);
	}
}
