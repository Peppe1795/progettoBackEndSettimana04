package Giuseppe.gestione_prenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Giuseppe.gestione_prenotazioni.Config.BeanConfiguration;
import Giuseppe.gestione_prenotazioni.DAO.EdificioService;
import Giuseppe.gestione_prenotazioni.DAO.PostazioneService;
import Giuseppe.gestione_prenotazioni.DAO.PrenotazioneService;
import Giuseppe.gestione_prenotazioni.DAO.UserService;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Gestione_prenotazioniRunner implements CommandLineRunner {
	@Autowired
	private BeanConfiguration beanCon;

	@Autowired
	private UserService userSrv;

	@Autowired
	private PostazioneService postazioneSrv;

	@Autowired
	private PrenotazioneService prenotazioneSrv;

	@Autowired
	private EdificioService edificioSrv;

	@Override
	public void run(String... args) throws Exception {

		userSrv.save(beanCon.user1());
		userSrv.save(beanCon.user2());
		userSrv.save(beanCon.user3());

		edificioSrv.save(beanCon.edificio1());
		edificioSrv.save(beanCon.edificio2());
		edificioSrv.save(beanCon.edificio3());

		postazioneSrv.save(beanCon.postazione1());
		postazioneSrv.save(beanCon.postazione2());
		postazioneSrv.save(beanCon.postazione3());

		prenotazioneSrv.save(beanCon.prenotazione1());
		prenotazioneSrv.save(beanCon.prenotazione2());
		prenotazioneSrv.save(beanCon.prenotazione3());

		postazioneSrv.getPostazioneByCitta("Milano");

	}

}
