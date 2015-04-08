package utils;

public final class MathUtils {
	
	public static Integer Combination(Integer quantity, Integer group){
		int parteArriba = Factorial(quantity);
		int parteAbajo = Factorial(quantity - group) * Factorial(group);
		return parteArriba / parteAbajo;
	}
	
	public static Integer Factorial(Integer number){
		int resul = 1;
		for (int i = 1; i <= number; i++)
			resul *= i;
		return resul;
	}
	
}
