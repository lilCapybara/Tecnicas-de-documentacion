
/**
 * @file Circulo.java
 *
 * @brief      La clase Circulo está en segundo nivel de la jerarquia.
 * @details    Permite definir circunferencias. A partir de allí es posible
 *			   invocar métodos diversos. 
 *			   
 * @attention  El método rotar no carece de sentido
 * @todo       Completar el resto de los métodos.
 *
 * @author     Oscar Enrique Goñi, oegoni@exa.unicen.edu.ar
 * @date       Septiembre 10, 2016
 * @version    0.2.0.1 (alpha)
 */
public class Circulo extends Figura{
    protected double radio;
    public Circulo(int x, int y, double radio){
        super(x,y);
        this.radio=radio;
    }
	
/**
 * @brief      Calcula el área de una figura Círculo.
 *
 * @details    Utilizando la fórmula Pi por radio al cuadrado realiza el cálculo de área
 *
 * @param      resultadoCero indica si el resultado es cero.
 * 			   No tiene demasiado sentido su funcionalidad, pero es sólo para demostrar
 * 			   su comportamiento.
 *
 * @return     El área de la circunferencia.
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
    public double area(boolean resultadoCero){
        if(radio!=0) 
			resultadoCero = false; 
		else 
			resultadoCero = true;
		return Math.PI*radio*radio;
		}
	}
