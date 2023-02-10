package com.epicode.progettow5.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.epicode.progettow5.entities.Edificio;
import com.epicode.progettow5.entities.Postazione;
import com.epicode.progettow5.entities.Prenotazione;
import com.epicode.progettow5.entities.Utente;
import com.epicode.progettow5.enums.TipoPostazione;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigGestionePrenotazioni {

////////////////////////////////////////////// EDIFICI //////////////////////////////////////////////
	
	// BEAN 'e1'
	@Value("${gestione.e1.nome}")
	private String e1Nome;
	
	@Value("${gestione.e1.indirizzo}")
	private String e1Indirizzo;
	
	
	@Value("${gestione.e1.citta}")
	private String e1Citta;

	@Bean
	Edificio e1() {
		Edificio e = Edificio.builder()
				.nome(e1Nome)
				.indirizzo(e1Indirizzo)
				.citta(e1Citta)
				.build();
		return e;
	}
	
	
	// BEAN 'e2'
		@Value("${gestione.e2.nome}")
		private String e2Nome;
		
		@Value("${gestione.e2.indirizzo}")
		private String e2Indirizzo;
		
		
		@Value("${gestione.e2.citta}")
		private String e2Citta;
	
	@Bean
	Edificio e2() {
		Edificio e = Edificio.builder()
				.nome(e2Nome)
				.indirizzo(e2Indirizzo)
				.citta(e2Citta)
				.build();
		return e;
	}
	
	
	// BEAN 'e3'
	@Value("${gestione.e3.nome}")
	private String e3Nome;
	
	@Value("${gestione.e3.indirizzo}")
	private String e3Indirizzo;
	
	
	@Value("${gestione.e3.citta}")
	private String e3Citta;

	@Bean
	Edificio e3() {
		Edificio e = Edificio.builder()
			.nome(e3Nome)
			.indirizzo(e3Indirizzo)
			.citta(e3Citta)
			.build();
		return e;
	}

////////////////////////////////////////////// UTENTI //////////////////////////////////////////////
	
	@Bean
	Utente u1() {
		Utente e = Utente.builder().fullname("Marina Muntenita").username("mm02").email("marinamm@gmail.com").build();
		return e;
	}

	@Bean
	Utente u2() {
		Utente e = Utente.builder().fullname("Mario Rossi").username("mrossi99").email("mrossi@gmail.com").build();
		return e;
	}

	@Bean
	Utente u3() {
		Utente e = Utente.builder().fullname("Luigi Verdi").username("lgv3").email("luigiverdi@gmail.com").build();
		return e;
	}
	
	@Bean
	Utente u4() {
		Utente e = Utente.builder().fullname("Paola Bianchi").username("paolapp").email("bianchipaola@gmail.com").build();
		return e;
	}

////////////////////////////////////////////// POSTAZIONI //////////////////////////////////////////////

	@Bean
	Postazione p1() {
		Postazione e = Postazione.builder().descrizione("Sala ad uso privato").tipo(TipoPostazione.PRIVATO).max_occupanti(30).edificio(e1()).build();
		return e;
	}
	
	@Bean
	Postazione p2() {
		Postazione e = Postazione.builder().descrizione("Sala riunioni").tipo(TipoPostazione.SALA_RIUNIONI).max_occupanti(50).edificio(e1()).build();
		return e;
	}
	
	@Bean
	Postazione p3() {
		Postazione e = Postazione.builder().descrizione("Spazio adibito per feste").tipo(TipoPostazione.OPENSPACE).max_occupanti(150).edificio(e2()).build();
		return e;
	}
	
	@Bean
	Postazione p4() {
		Postazione e = Postazione.builder().descrizione("Ufficio ad uso limitato").tipo(TipoPostazione.PRIVATO).max_occupanti(2).edificio(e2()).build();
		return e;
	}
	@Bean
	Postazione p5() {
		Postazione e = Postazione.builder().descrizione("Sala conferenze online").tipo(TipoPostazione.SALA_RIUNIONI).max_occupanti(10).edificio(e2()).build();
		return e;
	}
	
	@Bean
	Postazione p6() {
		Postazione e = Postazione.builder().descrizione("Open space studio").tipo(TipoPostazione.OPENSPACE).max_occupanti(200).edificio(e3()).build();
		return e;
	}
	
	@Bean
	Postazione p7() {
		Postazione e = Postazione.builder().descrizione("Galleria d'arte").tipo(TipoPostazione.PRIVATO).max_occupanti(130).edificio(e3()).build();
		return e;
	}
	
////////////////////////////////////////////// PRENOTAZIONI //////////////////////////////////////////////
	
	@Bean
	Prenotazione pr1() {
		Prenotazione e = Prenotazione.builder().utente(u1()).postazione(p1()).data(LocalDate.of(2023, 02, 19)).build();
		return e;
	}
	
	@Bean
	Prenotazione pr2() {
		Prenotazione e = Prenotazione.builder().utente(u1()).postazione(p7()).data(LocalDate.of(2023, 03, 10)).build();
		return e;
	}
	
	@Bean
	Prenotazione pr3() {
		Prenotazione e = Prenotazione.builder().utente(u3()).postazione(p2()).data(LocalDate.of(2023, 02, 20)).build();
		return e;
	}
	
	@Bean
	Prenotazione pr4() {
		Prenotazione e = Prenotazione.builder().utente(u2()).postazione(p5()).data(LocalDate.of(2023, 04, 03)).build();
		return e;
	}
	
	@Bean
	Prenotazione pr5() {
		Prenotazione e = Prenotazione.builder().utente(u3()).postazione(p7()).data(LocalDate.of(2023, 05, 22)).build();
		return e;
	}
}
