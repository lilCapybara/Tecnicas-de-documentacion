

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import restaurant.*;

public class RestaurantTest {

    @DisplayName("Test de usuarios repetidos")
    @Test
    public void testA(){
        Usuario u1 =new Usuario("Homero Simpson", 0, 350, "homerojsimpson@springfield.com");
	    Usuario u2 =new Usuario("Barney Gomez", 0, 0, "el14gomez@springfield.com");
        Usuario u3 =new Usuario("Edna Krabappel", 1, 0, "ednak@springfield.com");
        Usuario u4 =new Usuario("Homero", 0, 0, "homerojsimpson@springfield.com");

        Assertions.assertNotEquals(u1.getEmail(),u2.getEmail());
        Assertions.assertNotEquals(u1.getEmail(),u3.getEmail());
        Assertions.assertNotEquals(u1.getEmail(),u4.getEmail()); //Deberia dar error a esta altura

        Assertions.assertNotEquals(u2.getEmail(),u3.getEmail());
        Assertions.assertNotEquals(u2.getEmail(),u4.getEmail());

        Assertions.assertNotEquals(u3.getEmail(),u4.getEmail());
    }

    @DisplayName("Correo electronico valido")
    @Test
    public void testB(){
        Usuario u1 =new Usuario("Homero Simpson", 0, 350, "homerojsimpson@springfield.com");
        Usuario u2 =new Usuario("Barney Gomez", 0, 0, "el14gomez@springfield.com");
        Usuario u3 =new Usuario("Edna Krabappel", 1, 0, "ednak@springfield.com");
        Usuario u4 =new Usuario("Homero", 0, 0, "homerojsimpson@springfield.com");

        assert (u1.getEmail().contains("@"));
        assert (u2.getEmail().contains("@"));
        assert (u3.getEmail().contains("@"));
        assert (u4.getEmail().contains("@"));
    }

    @DisplayName("Receta con uno o mas ingredientes")
    @Test
    public void testC(){
        Ingrediente huevo=new Ingrediente("huevo", "unidades",240,10);
        Ingrediente harina=new Ingrediente("harina", "gramos",10000,30);
        Ingrediente papa = new Ingrediente("Papa","gramos",20000,5);
        Ingrediente sal = new Ingrediente("Sal","gramos",1000,5);
        Ingrediente carnePicada = new Ingrediente("Carne picada","grmos",10000,1);
        Ingrediente panHamburguesa = new Ingrediente("Pan de Hamburguesa","unidades",100,10);


        Producto gaseosaCola = new ProductoBasico("Coca Cola", 10,20);
        Producto agua = new ProductoBasico("Agua",10,22);


        ItemReceta ir1= new ItemReceta(huevo,1);
        ItemReceta ir2 = new ItemReceta(carnePicada, 100);
        ItemReceta ir3 =new ItemReceta(sal, 20);
        ItemReceta ir4 = new ItemReceta(huevo,4);
        ItemReceta ir5 = new ItemReceta(papa, 3);
        ItemReceta ir6 = new ItemReceta(panHamburguesa, 1);


        Receta tortilla=new Receta("Tortilla",15,400);
        tortilla.addIngrediente(ir4);
        tortilla.addIngrediente(ir5);

        Receta hamburguesa = new Receta("hamburguesa grande",5,500);
        hamburguesa.addIngrediente(ir2);
        hamburguesa.addIngrediente(ir1);
        hamburguesa.addIngrediente(ir3);
        hamburguesa.addIngrediente(ir6);

        Receta papasFritas = new Receta("papas fritas",7,200);
        papasFritas.addIngrediente(ir5);
        papasFritas.addIngrediente(ir3);

        Receta aire = new Receta("Aire", 0, 0);

        assert (!tortilla.getIngredientes().isEmpty());
        assert (!papasFritas.getIngredientes().isEmpty());
        assert (!hamburguesa.getIngredientes().isEmpty());
        assert (!aire.getIngredientes().isEmpty()); //Debe fallar aca
    }

    @DisplayName("Pedido reduce saldo de usuario")
    @Test
    public void testD(){
        float saldoA;

        float saldoB;

        //Assertions.assertNotEquals(saldoB,saldoA);
    }
}
