package Giuseppe.gestione_prenotazioni.DAO;

import java.util.List;

import Giuseppe.gestione_prenotazioni.entities.Postazione;

public interface IPostazioneDAO {
	public void save(Postazione postazione);

	public void findByIdAndUpdate(Long id, Postazione postazione);

	public void findByIdAndDelete(Long id);

	public Postazione findById(Long id);

	public List<Postazione> findAll();

	public long count();
}
