package Giuseppe.gestione_prenotazioni.DAO;

import java.util.List;

import Giuseppe.gestione_prenotazioni.entities.Edificio;

public interface IEdificioDAO {
	public void save(Edificio edificio);

	public void findByIdAndUpdate(Long id, Edificio edificio);

	public void findByIdAndDelete(Long id);

	public Edificio findById(Long id);

	public List<Edificio> findAll();

	public long count();
}
