public class Deportista {

	private String nombre;
	private String apellido;
	private String contacto;
	private Deporte deporte;
	private Equipo equipo;

	public Deportista(String nombre, String apellido, String contacto, Deporte deporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.contacto = contacto;
		this.deporte = deporte;
		this.equipo = null;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getContacto() {
		return this.contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public Deporte getDeporte() {
		return this.deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

}