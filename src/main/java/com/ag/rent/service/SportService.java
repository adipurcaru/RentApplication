package com.ag.rent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.rent.domain.Sport;
import com.ag.rent.repository.SportRepository;

@Service
public class SportService {

	private SportRepository sportRepository;
	
	@Autowired
	public SportService(SportRepository sportRepository) {
		this.sportRepository = sportRepository;
	}
	
	public List<Sport> getAllSports(){
		return sportRepository.findAll();
	}
}
