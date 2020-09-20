package com.ag.rent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ag.rent.domain.Field;

public interface FieldRepository extends JpaRepository<Field, Long>{

//	@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
	
	@Query(value = "SELECT t FROM Field t"
			+ " join t.sport s "
			+ " join t.city c "
			+ " where c.id=?1 AND s.id = ?2")
	List<Field> findByOrasAndSport(long oras, long sport);
}
