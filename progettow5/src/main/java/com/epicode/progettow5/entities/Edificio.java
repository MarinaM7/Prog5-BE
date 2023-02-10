package com.epicode.progettow5.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "edifici")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Edificio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	private String indirizzo;
	
	private String citta;
	
	@OneToMany(mappedBy = "edificio")
	private List<Postazione> postazioni;
}
