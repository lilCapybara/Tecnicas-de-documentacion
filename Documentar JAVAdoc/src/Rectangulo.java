 /**
 * @file rectangulo.java
 *
 * @brief      Esta clase implementa métodos para retángulos.
 * @details    Esta clase implementa métodos para rectángulos. Notar que al tratarse de 
 *			   rectángulos no es necesario que sus lados sean iguales		 
 *			   
 * @author     Oscar Enrique Goñi, oegoni@exa.unicen.edu.ar
 * @date       Septiembre 10, 2016
 * @version    0.2.0.1 (alpha)
 */
public class Rectangulo extends Figura{
    /**
	* @brief  ancho de la figura.
	*/
	protected double ancho;
	 /**
	* @brief  alto de la figura.
	*/
	protected double alto;
    public Rectangulo(int x, int y, double ancho, double alto){
        super(x,y);
        this.ancho=ancho;
        this.alto=alto;
    }
		
/**
 * @brief      Calcula el área de una figura Rectangulo.
 *
 * @details    Utilizando la fórmula alto por ancho realiza el cálculo de área
 *
 *
 * @return     El área del rectangulo.
 *
 * @retval     status   The program status.
 *                      <ul>
 *                         <li> 0 = Failure
 *                         <li> 1 = Success
 *                      </ul>
 *
 * @todo       Evaluar la eficiencia de cálcular potencia de dos o productos consecutivos.
 *
 * @bug        A comprobar, la resolución de PI puede no ser suficiente
 *
 * 
 * @see        <a href="http://java.sun.com">Java Documentation</a>
 */
    public double area(){
        return ancho*alto;
    }
}