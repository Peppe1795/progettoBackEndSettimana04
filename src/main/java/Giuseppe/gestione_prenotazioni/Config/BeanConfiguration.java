package Giuseppe.gestione_prenotazioni.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Giuseppe.gestione_prenotazioni.entities.Edificio;
import Giuseppe.gestione_prenotazioni.entities.Postazione;
import Giuseppe.gestione_prenotazioni.entities.Prenotazione;
import Giuseppe.gestione_prenotazioni.entities.User;

@Configuration
public class BeanConfiguration {
	@Bean
	public User user() {
		return new User();
	}

	@Bean
	public Prenotazione prenotazione() {
		return new Prenotazione();
	}

	@Bean
	public Postazione postazione() {
		return new Postazione();
	}

	@Bean
	public Edificio edificio() {
		return new Edificio();
	}

}
