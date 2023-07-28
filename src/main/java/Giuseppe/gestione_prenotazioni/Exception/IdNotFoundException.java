package Giuseppe.gestione_prenotazioni.Exception;

public class IdNotFoundException extends RuntimeException {
	public IdNotFoundException(Long id) {
		super("L'id che hai inserito: " + id + " non è presente nel data base!");
	}
}
