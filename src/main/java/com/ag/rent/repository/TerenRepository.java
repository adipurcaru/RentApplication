package com.ag.rent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ag.rent.domain.Teren;

public interface TerenRepository extends JpaRepository<Teren, Long>{

//	@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
	
	@Query(value = "SELECT * FROM terenuri t WHERE t.oras = ?1 AND t.sport = ?2", nativeQuery = true)
	List<Teren> findByOrasAndSport(String oras, String sport);
}
