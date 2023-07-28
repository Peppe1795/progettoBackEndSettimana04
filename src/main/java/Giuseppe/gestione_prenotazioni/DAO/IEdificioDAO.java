package Giuseppe.gestione_prenotazioni.DAO;

import java.util.List;

import Giuseppe.gestione_prenotazioni.entities.Edificio;
import Giuseppe.gestione_prenotazioni.entities.User;

public interface IEdificioDAO {
	public void save(Edificio user);

	public void findByIdAndUpdate(Long id, User user);

	public void findByIdAndDelete(Long id);

	public User findById(Long id);

	public List<User> findAll();

	public long count();
}
