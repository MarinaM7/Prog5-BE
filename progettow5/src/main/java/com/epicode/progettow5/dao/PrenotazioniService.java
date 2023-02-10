package com.epicode.progettow5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.progettow5.entities.Prenotazione;

@Service
public class PrenotazioniService {

	@Autowired
	private PrenotazioniRepository pr;
	
	public void insert(Prenotazione p) {
		pr.save(p);
	}

}
