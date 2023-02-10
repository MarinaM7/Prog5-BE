package com.epicode.progettow5.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.progettow5.entities.Utente;

@Repository
public interface UtentiRepository extends JpaRepository<Utente, Integer> {

}
