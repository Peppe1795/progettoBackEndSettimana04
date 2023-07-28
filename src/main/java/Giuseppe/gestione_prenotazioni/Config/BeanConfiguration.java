package Giuseppe.gestione_prenotazioni.Config;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Giuseppe.gestione_prenotazioni.entities.Edificio;
import Giuseppe.gestione_prenotazioni.entities.Postazione;
import Giuseppe.gestione_prenotazioni.entities.Prenotazione;
import Giuseppe.gestione_prenotazioni.entities.User;
import Giuseppe.gestione_prenotazioni.utils.TipoPostazione;

@Configuration
public class BeanConfiguration {
	@Bean("User1")
	public User user1() {

		return User.builder().username("peppe345").nomeCompleto("Giuseppe Petrucci").email("giuseppe@gmail.com")
				.build();
	}

	@Bean("User2")
	public User user2() {

		return User.builder().username("luca145").nomeCompleto("Luca Rossi").email("luca@gmail.com").build();
	}

	@Bean("User3")
	public User user3() {

		return User.builder().username("antonio126").nomeCompleto("Antonio Belli").email("antonio@gmail.com").build();
	}

	@Bean("Prenotazione1")
	public Prenotazione prenotazione1() {
		return Prenotazione.builder().id(UUID.randomUUID()).user(user1()).postazione(postazione1())
				.dataPrenotazione(LocalDate.of(2023, 5, 10)).build();
	}

	@Bean("Prenotazione2")
	public Prenotazione prenotazione2() {
		return Prenotazione.builder().id(UUID.randomUUID()).user(user2()).postazione(postazione2())
				.dataPrenotazione(LocalDate.of(2023, 6, 15)).build();
	}

	@Bean("Prenotazione3")
	public Prenotazione prenotazione3() {
		return Prenotazione.builder().id(UUID.randomUUID()).user(user3()).postazione(postazione3())
				.dataPrenotazione(LocalDate.of(2023, 7, 18)).build();
	}

	@Bean("Postazione1")
	public Postazione postazione1() {
		return Postazione.builder().descrizione("sala con pc da gamer").tipoPostazione(TipoPostazione.OPENSPACE)
				.numeroOccupantiMax(25).edificio(edificio1()).build();
	}

	@Bean("Postazione2")
	public Postazione postazione2() {
		return Postazione.builder().descrizione("sala con pc da Lavoro").tipoPostazione(TipoPostazione.PRIVATO)
				.numeroOccupantiMax(15).edificio(edificio2()).build();
	}

	@Bean("Postazione3")
	public Postazione postazione3() {
		return Postazione.builder().descrizione("sala congressi").tipoPostazione(TipoPostazione.SALA_RIUNIONI)
				.numeroOccupantiMax(50).edificio(edificio3()).build();
	}

	@Bean("Edificio1")
	public Edificio edificio1() {
		return Edificio.builder().nome("Empire state").indirizzo("via roma 125").citta("Milano").build();
	}

	@Bean("Edificio2")
	public Edificio edificio2() {
		return Edificio.builder().nome("Palazzo madama").indirizzo("via ferrara 15").citta("Firenze").build();
	}

	@Bean("Edificio3")
	public Edificio edificio3() {
		return Edificio.builder().nome("Hotel Lipton").indirizzo("via brombeis 12").citta("Napoli").build();
	}

}
