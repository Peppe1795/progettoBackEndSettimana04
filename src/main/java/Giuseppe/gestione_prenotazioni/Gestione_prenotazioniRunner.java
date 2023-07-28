package Giuseppe.gestione_prenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import Giuseppe.gestione_prenotazioni.Config.BeanConfiguration;
import Giuseppe.gestione_prenotazioni.DAO.EdificioService;
import Giuseppe.gestione_prenotazioni.DAO.PostazioneService;
import Giuseppe.gestione_prenotazioni.DAO.PrenotazioneService;
import Giuseppe.gestione_prenotazioni.DAO.UserService;

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
	}

}
