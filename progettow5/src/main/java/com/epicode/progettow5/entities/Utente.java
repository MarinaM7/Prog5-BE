package com.epicode.progettow5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "utenti")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fullname;
	
	private String username;
	
	private String email;

//	@OneToOne(mappedBy = "utente")
//	private Prenotazione prenotazione;
}
