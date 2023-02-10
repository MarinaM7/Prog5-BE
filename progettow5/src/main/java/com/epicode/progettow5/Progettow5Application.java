package com.epicode.progettow5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.progettow5.config.ConfigGestionePrenotazioni;
import com.epicode.progettow5.dao.EdificiService;
import com.epicode.progettow5.dao.PostazioniService;
import com.epicode.progettow5.dao.PrenotazioniService;
import com.epicode.progettow5.dao.UtentiService;
import com.epicode.progettow5.entities.Edificio;
import com.epicode.progettow5.entities.Postazione;
import com.epicode.progettow5.entities.Prenotazione;
import com.epicode.progettow5.entities.Utente;
import com.epicode.progettow5.enums.TipoPostazione;

@SpringBootApplication
public class Progettow5Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Progettow5Application.class, args);
	}
	
	@Autowired
	EdificiService es;
	
	@Autowired
	PostazioniService ps;
	
	@Autowired
	UtentiService us;
	
	@Autowired
	PrenotazioniService prs;
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigGestionePrenotazioni.class);

	@Override
	public void run(String... args) throws Exception {
		
		boolean insertEdifici = false;
		if( insertEdifici ) {
			insertEdifici();
		}
		
		boolean insertPostazioni = false;
		if( insertPostazioni ) {
			insertPostazioni();
		}
		
		boolean insertUtenti = false;
		if( insertUtenti ) {
			insertUtenti();
		}
		
		boolean insertPrenotazioni = false;
		if( insertPrenotazioni ) {
			insertPrenotazioni();
		}
		
		findByType(TipoPostazione.PRIVATO);
		
		((AnnotationConfigApplicationContext)ctx).close();
	}
	
	public void insertEdifici() {
		Edificio e1 = (Edificio)ctx.getBean("e1");
		es.insert(e1);
		
		Edificio e2 = (Edificio)ctx.getBean("e2");
		es.insert(e2);
		
		Edificio e3 = (Edificio)ctx.getBean("e3");
		es.insert(e3);
	}

	public void insertPostazioni() {
		Postazione p1 = (Postazione)ctx.getBean("p1");
		ps.insert(p1);
		
		Postazione p2 = (Postazione)ctx.getBean("p2");
		ps.insert(p2);
		
		Postazione p3 = (Postazione)ctx.getBean("p3");
		ps.insert(p3);
		
		Postazione p4 = (Postazione)ctx.getBean("p4");
		ps.insert(p4);
		
		Postazione p5 = (Postazione)ctx.getBean("p5");
		ps.insert(p5);
		
		Postazione p6 = (Postazione)ctx.getBean("p6");
		ps.insert(p6);
		
		Postazione p7 = (Postazione)ctx.getBean("p7");
		ps.insert(p7);
	}
	
	public void insertUtenti() {
		Utente u1 = (Utente)ctx.getBean("u1");
		us.insert(u1);
		
		Utente u2 = (Utente)ctx.getBean("u2");
		us.insert(u2);
		
		Utente u3 = (Utente)ctx.getBean("u3");
		us.insert(u3);
		
		Utente u4 = (Utente)ctx.getBean("u4");
		us.insert(u4);
	}
	
	public void insertPrenotazioni() {
		Prenotazione p1 = (Prenotazione)ctx.getBean("pr1");
		prs.insert(p1);
		
		Prenotazione p2 = (Prenotazione)ctx.getBean("pr2");
		prs.insert(p2);
		
		Prenotazione p3 = (Prenotazione)ctx.getBean("pr3");
		prs.insert(p3);
		
		Prenotazione p4 = (Prenotazione)ctx.getBean("pr4");
		prs.insert(p4);
		
		Prenotazione p5 = (Prenotazione)ctx.getBean("pr5");
		prs.insert(p5);
	}
	
	public void findByType(TipoPostazione tp) {
		List<Postazione> lp = ps.findByType(tp.toString());
		System.out.println(lp);
		
		lp.stream().forEach(p -> {
			System.out.println(p.getTipo() + " " + p.getEdificio());
		});
	}
	
}
