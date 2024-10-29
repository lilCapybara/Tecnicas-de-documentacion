
import org.junit.jupiter.api.DisplayName;


import parcial.tdyv.java.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ParcialTest {

    @DataProvider
    public Object[][] cargarUsuarios() {
        Socio s1 = new Socio("Carlos", "Sanchez", "34567434", 36);
        Socio s2 = new Socio("Juan", "Perez", "14567843", 78);
        Socio s3 = new Socio("Carlos", "Rodriguez", "23456432", 52);
        List<Socio> sociosCargados = new ArrayList<>();
        sociosCargados.add(s1);
        sociosCargados.add(s2);
        sociosCargados.add(s3);

        NominaSocios nomina = new NominaSocios(sociosCargados, 5, 1);
        return new Object[][] {
                {nomina} // Proveer el nomina
        };
    }

    @DisplayName("Verifica que no se carguen socios repetidos")
    @Test(dataProvider = "cargarUsuarios", expectedExceptions = { YaExisteSocioException.class })
    public void testA(NominaSocios nomina) throws YaExisteSocioException {
        Persona p1 = new Persona("Carlos", "Sanchez", "34567434", 36);
        // Intentar asociar un socio repetido
        nomina.Asociar(p1);

    }

    @DataProvider
    public Object[][] cargarActividades() {
        Persona p1 = new Persona("Carlos", "Sanchez", "34567434", 36);
        Actividad a1 = new Actividad("Pablo",p1,5,14);
        ArrayList<Actividad> actividadesCargados = new ArrayList<>();
        actividadesCargados.add(a1);
        OfertaActividades oa1 = new OfertaActividades();
        oa1.NuevaActividad(a1);

        return new Object[][] {
                {oa1}
        };
    }

    @DisplayName("Verifica que no se carguen actividades repetidas")
    @Test(dataProvider = "cargarActividades")
    public void testB(OfertaActividades oferta) {
        Persona p1 = new Persona("Carlos", "Sanchez", "34567434", 36);
        Actividad a1 = new Actividad("Pablo",p1,5,14);
        oferta.NuevaActividad(a1);
    }

    @DataProvider
    public Object[][] cargarActividad() {
        Persona p1 = new Persona("Carlos", "Sanchez", "34567434", 36);
        return new Object[][] {new Actividad[]{new Actividad("Tenis",p1,5,14)}};
    }

    @DisplayName("verifica el funcionamiento del tostring")
    @Test(dataProvider = "cargarActividad")
    public void testD(Actividad actividad) {
        String esperado="Tenis  a cargo de Carlos";

        assertEquals(esperado,actividad.toString());
    }

    @DataProvider
    public Object[][] cargarSocio(){
        Socio s1 = new Socio("Carlos", "Sanchez", "34567434", 36);
        return new Object[][] {new Socio[]{s1}};
    }

    @DisplayName("verifica el funcionamiento del tostring")
    @Test(dataProvider = "cargarSocio")
    public void testE(Socio socio){
        String esperado = "Sanchez,  Carlos";
        assertEquals(socio.toString(),esperado);
    }


    
}

