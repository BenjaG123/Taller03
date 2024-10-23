import java.util.List;

public class Cancha {

	private String tipoSuperficie;
	private String ubicacion;
	private int capacidadEspectadores;
	private List<Partido> partidos;

	public Cancha(String tipoSuperficie, String ubicacion, int capacidadEspectadores) {
		this.tipoSuperficie = tipoSuperficie;
		this.ubicacion = ubicacion;
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public String getTipoSuperficie() {
		return this.tipoSuperficie;
	}

	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidadEspectadores() {
		return this.capacidadEspectadores;
	}

	public void setCapacidadEspectadores(int capacidadEspectadores) {
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public List<Partido> getPartidos() { return this.partidos; }

	public void setPartidos(List<Partido> partidos) { this.partidos = partidos; }

	public boolean consultarDisponibilidad () {
		if (this.partidos.size() == 0) {
			return true;
		}
		return false;
	}

}