package Giuseppe.gestione_prenotazioni.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Giuseppe.gestione_prenotazioni.Exception.IdNotFoundException;
import Giuseppe.gestione_prenotazioni.entities.User;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserRepository ur;

	public void save(User user) {
		ur.save(user);
		log.info(user.getNomeCompleto() + " salvato!");
	}

	public List<User> findAll() {
		return ur.findAll();
	}

	public User findById(String username) throws IdNotFoundException {

		return ur.findById(username).orElseThrow(() -> new IdNotFoundException(username));
	}

	public void findByIdAndUpdate(String username, User user) throws IdNotFoundException {
		User trovato = this.findById(username);
		trovato.setUsername(username);
		trovato.setNomeCompleto(user.getNomeCompleto());
		trovato.setEmail(user.getEmail());
		ur.save(trovato);
	}

	public void findByIdAndDelete(String username) throws IdNotFoundException {
		User trovato = this.findById(username);
		ur.delete(trovato);
	}

	public long count() {
		return ur.count();
	}
}
