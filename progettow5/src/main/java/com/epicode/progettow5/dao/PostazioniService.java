package com.epicode.progettow5.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.progettow5.entities.Edificio;
import com.epicode.progettow5.entities.Postazione;

@Service
public class PostazioniService {
	
	@Autowired
	private PostazioniRepository postazioniRepo;
	
	public List<Postazione> getAll() {
		return postazioniRepo.findAll();
	}
	
	public Optional<Postazione> getById(int id){
		return postazioniRepo.findById(id);
	}

	public void insert(Postazione p) {
		postazioniRepo.save(p);
	}
	
	public List<Postazione> findByType(String s) {
		return postazioniRepo.findByType(s);
	}
}
