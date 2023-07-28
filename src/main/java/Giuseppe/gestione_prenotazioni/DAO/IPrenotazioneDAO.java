package Giuseppe.gestione_prenotazioni.DAO;

import java.util.List;
import java.util.UUID;

import Giuseppe.gestione_prenotazioni.entities.Prenotazione;

public interface IPrenotazioneDAO {
	public void save(Prenotazione prenotazione);

	public void findByIdAndUpdate(UUID id, Prenotazione prenotazione);

	public void findByIdAndDelete(UUID id);

	public Prenotazione findById(UUID id);

	public List<Prenotazione> findAll();

	public long count();
}
