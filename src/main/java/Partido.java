import java.util.ArrayList;
import java.util.List;

public class Partido {

	private List<Equipo> equiposParticipantes;
	private String resultado;
	private String fecha;
	private Cancha canchaAsignada;

	public Partido(String resultado, String fecha, Cancha canchaAsignada) {
		this.resultado = resultado;
		this.fecha = fecha;
		this.canchaAsignada = canchaAsignada;
		this.equiposParticipantes = new ArrayList<Equipo>();
	}

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

	public void asignarEquipos(Equipo equipo) {
		if (equiposParticipantes.size() > 0 && equiposParticipantes.size()<3) {
			equiposParticipantes.add(equipo);
		} else {
			System.out.println("El partido ya tiene el maximo de equipos");
		}
	}

}