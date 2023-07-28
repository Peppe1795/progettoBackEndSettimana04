package Giuseppe.gestione_prenotazioni.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Giuseppe.gestione_prenotazioni.entities.Postazione;
import Giuseppe.gestione_prenotazioni.utils.TipoPostazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
	List<Postazione> findByEdificioCitta(String citta);

	List<Postazione> findByTipoPostazione(TipoPostazione tipoPostazione);
}
