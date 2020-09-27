package com.ag.rent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.ag.rent.domain.Facility;
import com.ag.rent.repository.FacilityRepository;

@Service
public class FacilityService {

	private FacilityRepository facilityRepository;
	
	@Autowired
	public FacilityService(FacilityRepository facilityRepository) {
		this.facilityRepository = facilityRepository;
	}
	
	public List<Facility> getAllFacilities(){
		return this.facilityRepository.findAll();
	}
}
