package Giuseppe.gestione_prenotazioni.Exception;

import java.util.UUID;

public class UUIDNotFoundException extends RuntimeException {
	public UUIDNotFoundException(UUID id) {
		super("L'id che hai inserito: " + id + " non è presente nel data base!");
	}
}
