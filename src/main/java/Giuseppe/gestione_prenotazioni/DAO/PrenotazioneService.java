package Giuseppe.gestione_prenotazioni.DAO;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Giuseppe.gestione_prenotazioni.Exception.UUIDNotFoundException;
import Giuseppe.gestione_prenotazioni.entities.Prenotazione;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PrenotazioneService {
	@Autowired
	private PrenotazioneRepository pr;

	public void save(Prenotazione prenotazione) {
		pr.save(prenotazione);
		log.info("La prenotazione con id: " + prenotazione.getId() + " salvata!");
	}

	public List<Prenotazione> findAll() {
		return pr.findAll();
	}

	public Prenotazione findById(UUID id) throws UUIDNotFoundException {

		return pr.findById(id).orElseThrow(() -> new UUIDNotFoundException(id));
	}

	public void findByIdAndUpdate(UUID id, Prenotazione prenotazione) throws UUIDNotFoundException {
		Prenotazione trovato = this.findById(id);
		trovato.setId(id);
		trovato.setPostazione(prenotazione.getPostazione());
		trovato.setDataPrenotazione(prenotazione.getDataPrenotazione());
		pr.save(trovato);
	}

	public void findByIdAndDelete(UUID id) throws UUIDNotFoundException {
		Prenotazione trovato = this.findById(id);
		pr.delete(trovato);
	}

	public long count() {
		return pr.count();
	}

}
