package Giuseppe.gestione_prenotazioni.Exception;

public class IdNotFoundException extends RuntimeException {
	public IdNotFoundException(String username) {
		super("L'username che hai inserito: " + username + " non è presente nel data base!");
	}
}
