

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import restaurant.*;

public class RestaurantTest {

    @DisplayName("Busca usuarios repetidos")
    @Test
    public void testA(){
        Usuario u1 =new Usuario("Homero Simpson", 0, 350, "homerojsimpson@springfield.com");
	    Usuario u2 =new Usuario("Barney Gomez", 0, 0, "el14gomez@springfield.com");
        Usuario u3 =new Usuario("Edna Krabappel", 1, 0, "ednak@springfield.com");
        Usuario u4 =new Usuario("Homero", 0, 0, "homerojsimpson@springfield.com");

        Assertions.assertEquals();
    }

    @Test
    public void testB{

    }

    @Test
    public void testC{

    }

    @Test
    public void testD{

    }
}
