import java.util.List;

public class Equipo {

	private String nombre;
	private List<Deportista> deportistas;
	private Entrenador entrenador;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Deportista> getDeportistas() {
		return this.deportistas;
	}

	public void setDeportistas(List<Deportista> deportistas) {
		this.deportistas = deportistas;
	}

	public Entrenador getEntrenador() {
		return this.entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

}