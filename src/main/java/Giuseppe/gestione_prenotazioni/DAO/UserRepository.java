package Giuseppe.gestione_prenotazioni.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Giuseppe.gestione_prenotazioni.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
