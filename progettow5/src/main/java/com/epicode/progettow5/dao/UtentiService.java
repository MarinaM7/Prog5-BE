package com.epicode.progettow5.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.progettow5.entities.Utente;

@Service
public class UtentiService {

	@Autowired
	private UtentiRepository utentiRepo;
	
	public List<Utente> getAll() {
		return utentiRepo.findAll();
	}

	public void insert(Utente u) {
		utentiRepo.save(u);
		
	}
	
}
