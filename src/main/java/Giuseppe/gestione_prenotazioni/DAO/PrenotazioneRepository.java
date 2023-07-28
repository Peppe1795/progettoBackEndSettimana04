package Giuseppe.gestione_prenotazioni.DAO;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Giuseppe.gestione_prenotazioni.entities.Prenotazione;
import Giuseppe.gestione_prenotazioni.entities.User;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {
	List<Prenotazione> findByUser(User user);

	boolean existsByUserAndDataPrenotazione(User user, LocalDate dataprenotazione);
}
