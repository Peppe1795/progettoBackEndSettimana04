package Giuseppe.gestione_prenotazioni.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Giuseppe.gestione_prenotazioni.Exception.LongIdNotFoundException;
import Giuseppe.gestione_prenotazioni.entities.Postazione;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostazioneService {
	@Autowired
	private PostazioneRepository pr;

	public void save(Postazione postazione) {
		pr.save(postazione);
		log.info("La postazione con id: " + postazione.getId() + " salvato!");
	}

	public Postazione findById(Long id) throws LongIdNotFoundException {

		return pr.findById(id).orElseThrow(() -> new LongIdNotFoundException(id));

	}

	public List<Postazione> getPostazioneByCitta(String citta) {
		List<Postazione> postazioni = pr.findByEdificioCitta(citta);

		if (postazioni.isEmpty()) {
			log.info("Nessuna postazione trovata per la città: {}", citta);
		} else {
			log.info("Postazioni trovate per la città {}: ", citta);
			for (Postazione postazione : postazioni) {
				log.info("ID: {}, Descrizione: {}, Tipo: {}, Occupati Max: {}, Edificio: {}", postazione.getId(),
						postazione.getDescrizione(), postazione.getTipoPostazione(), postazione.getNumeroOccupantiMax(),
						postazione.getEdificio().getCitta());
			}
		}

		return postazioni;
	}

	public void findByIdAndUpdate(Long id, Postazione postazione) throws LongIdNotFoundException {
		Postazione trovato = this.findById(id);
		trovato.setId(id);
		trovato.setDescrizione(postazione.getDescrizione());
		trovato.setTipoPostazione(postazione.getTipoPostazione());
		trovato.setNumeroOccupantiMax(postazione.getNumeroOccupantiMax());
		pr.save(trovato);
	}

	public void findByIdAndDelete(Long id) throws LongIdNotFoundException {
		Postazione trovato = this.findById(id);
		pr.delete(trovato);
	}

	public long count() {
		return pr.count();
	}
}
