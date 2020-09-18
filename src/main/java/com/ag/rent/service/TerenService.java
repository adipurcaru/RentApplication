package com.ag.rent.service;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.rent.domain.Teren;
import com.ag.rent.repository.TerenRepository;

@Service
public class TerenService {

	private TerenRepository terenRepository;
	
	@Autowired
	public TerenService(TerenRepository terenRepository) {
		this.terenRepository = terenRepository;	
	}
	
	public List<Teren> getAllTerenuri(){
		return terenRepository.findAll();
	}
	
	public List<Teren> searchByOrasAndSport(String sport, String oras){
		return terenRepository.findByOrasAndSport(sport, oras);
	}
	
	
}
