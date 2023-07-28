package Giuseppe.gestione_prenotazioni.DAO;

import java.util.List;

import Giuseppe.gestione_prenotazioni.entities.User;

public interface IUserDAO {
	public void save(User user);

	public void findByIdAndUpdate(String username, User user);

	public void findByIdAndDelete(String username);

	public User findById(String username);

	public List<User> findAll();

	public long count();

}
