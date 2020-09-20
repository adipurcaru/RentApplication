package com.ag.rent.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.rent.domain.Field;
import com.ag.rent.repository.FieldRepository;

@Service
public class TerenService {

	private FieldRepository terenRepository;
	
	@Autowired
	public TerenService(FieldRepository terenRepository) {
		this.terenRepository = terenRepository;	
	}
	
	public List<Field> getAllTerenuri(){
		return terenRepository.findAll();
	}
	
	public List<Field> searchByOrasAndSport(long oras, long sport){
		return terenRepository.findByOrasAndSport(oras, sport);
	}
	
	public Optional<Field> getTerenByID(long id) {
		return terenRepository.findById(id);
	}
	
	
}
