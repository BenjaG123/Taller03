public class Entrenador {

	private String nombre;
	private String experiencia;
	private Deporte deporteEspecializado;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public Deporte getDeporteEspecializado() {
		return this.deporteEspecializado;
	}

	public void setDeporteEspecializado(Deporte deporteEspecializado) {
		this.deporteEspecializado = deporteEspecializado;
	}

}