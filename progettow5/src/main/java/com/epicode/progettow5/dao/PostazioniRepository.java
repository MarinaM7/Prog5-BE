package com.epicode.progettow5.dao;

import com.epicode.progettow5.entities.Postazione;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PostazioniRepository extends JpaRepository<Postazione, Integer> {

	@Query(
			nativeQuery = true,
			value = "SELECT * FROM postazioni WHERE tipo = :t"
		)
		List<Postazione> findByType(@Param("t") String fn);
	
}
