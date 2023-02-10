package com.epicode.progettow5.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.progettow5.entities.Edificio;

@Service
public class EdificiService {

	@Autowired
	private EdificiRepository edificiRepo;
	
	public List<Edificio> getAll() {
		return edificiRepo.findAll();
	}
	
	public void insert(Edificio p) {
		edificiRepo.save(p);
	}
	
}
