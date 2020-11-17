package javaclassesobjects2;

public class MagicCalculator {

	public double sqroot(int num1) {
		return Math.sqrt(num1);
	}

	public double sin(double num1) {
		return Math.sin( Math.toRadians(num1));
	}

	public double cosin(double num1) {
		return Math.cos(Math.toRadians(num1));
	}

	public double tangent(double num1) {
		return Math.tan(Math.toRadians(num1));
	}

	/**
	 * This is a recursion 
	 * @param n
	 * @return
	 */
	public int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}
