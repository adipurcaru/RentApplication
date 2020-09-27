package com.ag.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rent.domain.Facility;
import com.ag.rent.service.FacilityService;

@RestController
@RequestMapping("/facility")
public class FacilityController {

	@Autowired
	private FacilityService facilityService;
	
	@GetMapping
	public List<Facility> getAllFacilities() {
		return this.facilityService.getAllFacilities();
	}
	
}
