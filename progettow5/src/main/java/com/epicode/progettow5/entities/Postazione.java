package com.epicode.progettow5.entities;

import com.epicode.progettow5.enums.TipoPostazione;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "postazioni")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Postazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;
	
	private int max_occupanti;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "edificio_id", referencedColumnName = "id")
	private Edificio edificio;
	
}
