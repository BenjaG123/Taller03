import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TallerTest {

    private Club club;
    private Cancha cancha;
    private Deporte deporte;
    private Deportista deportista;
    private Entrenador entrenador;
    private Equipo equipo;
    private Partido partido;

    @BeforeEach
    void setUp() {
        Deporte futbol = new Deporte("Futbol");
        Club ufro = new Club("Ufro");
        Equipo informaticaFC= new Equipo("Informatica FC");
    }
}
