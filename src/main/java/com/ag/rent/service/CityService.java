package com.ag.rent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.rent.domain.City;
import com.ag.rent.repository.CityRepository;

@Service
public class CityService {

private CityRepository cityRepository;
	
	@Autowired
	public CityService(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}
	
	public List<City> getAllSports(){
		return cityRepository.findAll();
	}
}
