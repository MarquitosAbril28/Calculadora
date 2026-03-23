/**
 * Clase que proporciona operaciones aritméticas básicas.
 * Esta implementación incluye métodos para suma, resta, multiplicación y división.
 * * @author Marcos
 * @version 1.0
 */
public class Calculadora {
	
    /**
     * Realiza la suma de dos números enteros.
     * * @param a Primer sumando.
     * @param b Segundo sumando.
     * @return El resultado de la suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b;
    }
	
    /**
     * Realiza la resta de dos números enteros.
     * * @param a Minuendo.
     * @param b Sustraendo.
     * @return El resultado de restar b a a.
     */
    public int restar(int a, int b) {
        return a - b;
    }
	
    /**
     * Realiza la multiplicación de dos números enteros.
     * * @param a Primer factor.
     * @param b Segundo factor.
     * @return El producto de a y b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
	
    /**
     * Realiza la división entera de dos números.
     * Nota: Si el divisor es 0, Java lanzará una ArithmeticException.
     * * @param a Dividendo.
     * @param b Divisor (no debe ser 0).
     * @return El cociente de la división entera.
     * @throws ArithmeticException Si el divisor es cero.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            // Es buena práctica controlar o documentar la división por cero en Java
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}