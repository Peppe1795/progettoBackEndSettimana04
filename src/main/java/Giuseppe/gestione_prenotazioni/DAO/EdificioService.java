package Giuseppe.gestione_prenotazioni.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Giuseppe.gestione_prenotazioni.Exception.LongIdNotFoundException;
import Giuseppe.gestione_prenotazioni.entities.Edificio;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EdificioService {
	@Autowired
	private EdificioRepository er;

	public void save(Edificio edificio) {
		er.save(edificio);
		log.info("L'edificio con id: " + edificio.getId() + " salvato!");
	}

	public List<Edificio> findAll() {
		return er.findAll();
	}

	public Edificio findById(Long id) throws LongIdNotFoundException {

		return er.findById(id).orElseThrow(() -> new LongIdNotFoundException(id));
	}

	public void findByIdAndUpdate(Long id, Edificio edificio) throws LongIdNotFoundException {
		Edificio trovato = this.findById(id);
		trovato.setId(id);
		trovato.setNome(edificio.getNome());
		trovato.setIndirizzo(edificio.getIndirizzo());
		trovato.setCitta(edificio.getCitta());
		er.save(trovato);
	}

	public void findByIdAndDelete(Long id) throws LongIdNotFoundException {
		Edificio trovato = this.findById(id);
		er.delete(trovato);
	}

	public long count() {
		return er.count();
	}
}
