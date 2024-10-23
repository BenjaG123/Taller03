import java.util.ArrayList;
import java.util.List;

public class Club {

	private String nombre;
	private List<Equipo> equipos;
	private List<Partido> partidos;
	private List<Cancha> canchas;

	public Club(String nombre) {
		this.nombre = nombre;
		this.equipos = new ArrayList<>();
		this.partidos = new ArrayList<>();
		this.canchas = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Equipo> getEquipos() {
		return this.equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	public List<Partido> getPartidos() { return this.partidos; }

	public void setPartidos(List<Partido> partidos) { this.partidos = partidos; }

	public void agregarEquipo(Equipo equipo) {
		this.equipos.add(equipo);
	}

	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
	}

	public void agregarCancha(Cancha cancha) {
		this.canchas.add(cancha);
	}

	public List<Cancha> getCanchas() { return this.canchas; }

	public void setCanchas(List<Cancha> canchas) { this.canchas = canchas; }

}