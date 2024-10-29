

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import restaurant.*;

public class RestaurantTest {

    static Usuario u1;
    static Usuario u2;
    static Usuario u3;
    static Usuario u4;

    static Receta tortilla;
    static Receta hamburguesa;
    static Receta papasFritas;
    static Receta aire;

    static Ingrediente huevo;
    static Ingrediente harina;
    static Ingrediente papa;
    static Ingrediente sal;
    static Ingrediente carnePicada;
    static Ingrediente panHamburguesa;

    static ItemReceta ir1;
    static ItemReceta ir2;
    static ItemReceta ir3;
    static ItemReceta ir4;
    static ItemReceta ir5;
    static ItemReceta ir6;

    @BeforeAll
    public static void cargarDatos(){
        huevo=new Ingrediente("huevo", "unidades",240,10);
        harina=new Ingrediente("harina", "gramos",10000,30);
        papa = new Ingrediente("Papa","gramos",20000,5);
        sal = new Ingrediente("Sal","gramos",1000,5);
        carnePicada = new Ingrediente("Carne picada","grmos",10000,1);
        panHamburguesa = new Ingrediente("Pan de Hamburguesa","unidades",100,10);


        Producto gaseosaCola = new ProductoBasico("Coca Cola", 10,20);
        Producto agua = new ProductoBasico("Agua",10,22);


        ir1= new ItemReceta(huevo,1);
        ir2 = new ItemReceta(carnePicada, 100);
        ir3 =new ItemReceta(sal, 20);
        ir4 = new ItemReceta(huevo,4);
        ir5 = new ItemReceta(papa, 3);
        ir6 = new ItemReceta(panHamburguesa, 1);


        tortilla=new Receta("Tortilla",15,400);
        tortilla.addIngrediente(ir4);
        tortilla.addIngrediente(ir5);

        hamburguesa = new Receta("hamburguesa grande",5,500);
        hamburguesa.addIngrediente(ir2);
        hamburguesa.addIngrediente(ir1);
        hamburguesa.addIngrediente(ir3);
        hamburguesa.addIngrediente(ir6);

        papasFritas = new Receta("papas fritas",7,200);
        papasFritas.addIngrediente(ir5);
        papasFritas.addIngrediente(ir3);

        aire = new Receta("Aire", 0, 0);

         u1 =new Usuario("Homero Simpson", 0, 350, "homerojsimpson@springfield.com");
         u2 =new Usuario("Barney Gomez", 0, 0, "el14gomez@springfield.com");
         u3 =new Usuario("Edna Krabappel", 1, 0, "ednak@springfield.com");
         u4 =new Usuario("Homero", 0, 0, "homerojsimpson@springfield.com");

        Producto p1= new ProductoBasico("Lata Coca Cola", 10, 20);
        Producto p2= new ProductoBasico("Lata Sprite", 10, 22);
        Producto p3= new ProductoElaborado("Retorti", 120);
        ((ProductoElaborado)p3).setReceta(tortilla);
        Producto p4= new ProductoElaborado("BIG O", 150);
        ((ProductoElaborado)p4).setReceta(hamburguesa);
        Producto p5= new ProductoElaborado("PATATAS", 120);
        ((ProductoElaborado)p3).setReceta(papasFritas);

        Mostrador m1= new Mostrador();
        m1.setNombreOperador("Jose");
        Mostrador m2= new Mostrador();
        m2.setNombreOperador("Maria");


        Cocina c= new Cocina();
        c.start();

        Pedido p= new Pedido();
        p.setUsuario(u1);
        p.agregarItem(new ItemPedido(1,p1));
        p.agregarItem(new ItemPedido(1, p3));
        try {
            p.solicitarPedido();

            Mostrador ordenesActuales = new Mostrador();

            //ordenesActuales.agregar(p);

            p.prepararPedido();
            p.terminarPedido();
            p.entregarPedido();



        } catch (SinSaldoException ex) {
            System.out.println("No posee saldo suficiente");
        }

        System.out.println("Saldo Usuario "+u1.getSaldo());
    }


    @DisplayName("Test de usuarios repetidos")
    @Test
    public void testA(){
/*      //Sin usar el metodo de carga de datos
        u1 =new Usuario("Homero Simpson", 0, 350, "homerojsimpson@springfield.com");
        u2 =new Usuario("Barney Gomez", 0, 0, "el14gomez@springfield.com");
        u3 =new Usuario("Edna Krabappel", 1, 0, "ednak@springfield.com");
        u4 =new Usuario("Homero", 0, 0, "homerojsimpson@springfield.com");
*/
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
        assert (u1.getEmail().contains("@"));
        assert (u2.getEmail().contains("@"));
        assert (u3.getEmail().contains("@"));
        assert (u4.getEmail().contains("@"));
    }

    @DisplayName("Receta con uno o mas ingredientes")
    @Test
    public void testC(){
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
