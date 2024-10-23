import java.util.List;

public class Partido {

	private List<Equipo> equiposParticipantes;
	private String resultado;
	private String fecha;
	private Cancha canchaAsignada;

	public List<Equipo> getEquiposParticipantes() {
		return this.equiposParticipantes;
	}

	public void setEquiposParticipantes(List<Equipo> equiposParticipantes) {
		this.equiposParticipantes = equiposParticipantes;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Cancha getCanchaAsignada() {
		return this.canchaAsignada;
	}

	public void setCanchaAsignada(Cancha canchaAsignada) {
		this.canchaAsignada = canchaAsignada;
	}

}