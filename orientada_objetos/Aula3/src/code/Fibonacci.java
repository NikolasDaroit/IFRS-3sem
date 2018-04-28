package code;
public class Fibonacci {
	 

    public static int calculaFibonacci(int n){
    	return (n < 2) ? n : calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
    }
}