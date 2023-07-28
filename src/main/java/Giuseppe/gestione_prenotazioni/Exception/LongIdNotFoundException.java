package Giuseppe.gestione_prenotazioni.Exception;

public class LongIdNotFoundException extends RuntimeException {
	public LongIdNotFoundException(Long id) {
		super("L'id che hai inserito: " + id + " non è presente nel data base!");
	}
}
