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

	public List<Postazione> findAll() {
		return pr.findAll();
	}

	public Postazione findById(Long id) throws LongIdNotFoundException {

		return pr.findById(id).orElseThrow(() -> new LongIdNotFoundException(id));
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
