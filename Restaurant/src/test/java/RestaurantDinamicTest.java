import org.junit.jupiter.api.Test;
import org.testng.annotations.DataProvider;
import restaurant.Usuario;

public class RestaurantDinamicTest {

    @DataProvider
    public Object[] cargarUsuarios(){
        return new Usuario[]{
               new Usuario("Homero Simpson", 0, 350, "homerojsimpson@springfield.com"),
                new Usuario("Barney Gomez", 0, 0, "el14gomez@springfield.com"),
                new Usuario("Edna Krabappel", 1, 0, "ednak@springfield.com"),
                new Usuario("Homero", 0, 0, "homerojsimpson@springfield.com")
        };
    }

    @Test(DataProvider="cargarUsuarios")
    public void testB(){
        Usuario[] usuarios = cargarUsuarios();
        for(Usuario user:usuarios){
            assert (user.getEmail().contains("@"))
        }
    }


}
