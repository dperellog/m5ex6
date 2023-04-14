/**
 * This class has all the features needed to instantiate a calculator.
 * 
 * @author David/Guillem
 * @since 1.0.0
 * @version 1.0.1
 */
public class Calculadora {

    @SuppressWarnings("unused")
	private static final double PI = 3.14159265358979;
    @SuppressWarnings("unused")
	private static final double E = 2.718281828459;
 
    /**
     * Method used to instantiate a calculator.
     */
    public Calculadora() {
    }

    /**
     * Method used to add two numbers together.
     * 
     * @param a First number in *double* format.
     * @param b	Second number in *double* format.
     * @return Sum of num1 and num2.
     */
    public double sumar(double a, double b){
        return a + b;
    }    


    /**
     * Method used to subtract two numbers from each other.
     * 
     * @param a First number in *double* format.
     * @param b	Second number in *double* format.
     * @return Subtract from num1 and num2.
     */
    public double restar(double a, double b){
        return a - b;
    }

    /**
     * Method used to multiply two numbers together.
     * 
     * @param a First number in *double* format.
     * @param b	Second number in *double* format.
     * @return Multiplication of num1 and num2 by each other.
     */
    public double multiplicar(double a, double b){
        return a * b;
    }
    

    /**
     * Method used to divide two numbers by each other.
     * 
     * @param a First number in *double* format.
     * @param b	Second number in *double* format.
     * @return Result of dividing num1 by num2.
     * @throws ArithmeticException when divident is 0.
     */
    public double dividir(double a, double b) throws ArithmeticException{
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("Intent de divisió entre zero.");
        }
    }

    /**
     * Method used to calculate the power of a number.
     * 
     * @param base *Double* number that acts as the base.
     * @param exponent Number of double type that acts as the exponent.
     * @return The result of raising the base by the exponent.
     */
    public double potencia(double base, double exponent){
        return Math.pow(base, exponent);
    }

    /**
     * Gets the absolute value of a *double* number.
     * 
     * @param valor Number to get the absolute value of.
     * @return The absolute number of value.
     */
    public double valorAbsolut(double valor){
        return Math.abs(valor);
    }
}
