/**
 * @mainpage  Esta es la p�gina principal de la documentaci�n
 *
 *          Aqu� se agrega toda la descripci�n del 
			objetivo de la clase.
 *            <p/> <br/>
 */
 /**
 * @file Figura.java
 *
 * @brief      La clase figura es la superior de la jerarquia.
 * @details    Es necesario abstraer el comportamiento de todas las clases
 *			   que heredar�n de ella. 
 *			   
 * @attention  La clase figura es abstracta, por lo tanto no puede ser instanciada
 * 			   Es decir, el siguiente c�digo no puede ejecutarse:
 * @code
 *    Figura fig = new Figura();
 *    fig.show();
 * @endcode
 * @warning    Esta clase tiene utilidad m�s que demostrar el comportamiento de Doxygen
 * 
 * @bug        Esta clase sguramente tiene bugs y nunca compilar� por errores de sint�xis.
 * @todo       Completar utilizando otros ejemplos.
 *
 * @author     Oscar Enrique Go�i, oegoni@exa.unicen.edu.ar
 * @date       Septiembre 10, 2016
 * @version    0.2.0.1 (alpha)
 */
 

public abstract class Figura {
    /**
	* @brief  Posici�n x de la figura.
	*/
	protected int x;
    /**
	* @brief  Posici�n y de la figura.
	*/
	protected int y;
	
    public Figura(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public abstract double area(boolean resultadoCero);
}