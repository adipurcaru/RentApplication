package com.ag.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ag.rent.domain.Facility;

public interface FacilityRepository extends JpaRepository<Facility, Long>{

}
