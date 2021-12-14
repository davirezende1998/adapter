import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MedidasTest {
    @Test
    void deveRetornarDistanciaEmKM() {
        Medidas distancia = new Medidas();
        distancia.setDistance(1);
        assertEquals(1.0000190199999999, distancia.getDistance());
    }

    //OBS: Encontrar uma função que limite apenas 4 casas decimais!!
}