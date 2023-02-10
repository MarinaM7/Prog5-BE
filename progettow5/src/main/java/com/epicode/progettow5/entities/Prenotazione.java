package com.epicode.progettow5.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "utente_id", referencedColumnName = "id")
	private Utente utente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "postazione_id", referencedColumnName = "id")
	private Postazione postazione;
	
	private LocalDate data;
	
}

