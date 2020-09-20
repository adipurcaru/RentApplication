package com.ag.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ag.rent.domain.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
