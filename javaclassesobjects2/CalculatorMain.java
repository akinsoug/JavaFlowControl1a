package javaclassesobjects2;

/**
 * Create a Java Calculator Class that does the following five commands:
An add method that takes in two integer numbers and adds them together the call to that method would look like this: add(int num1, int num2)
A subtraction method that takes in two integers and subtracts them from one another would look like this: subtract( int num1, int num2)
A multiplication method that takes in two integer numbers and multiplies them together the call to that method would look like this: multiply(int num1, int num2)
A division method that takes in two integer numbers and divides them the call to that method would look like this: divide(int num1, int num2)
A square method that takes in one integer and squares it: square(int num1, int num2)

Create a MagicCalculator that inherits its basic functionality from your calculator and does the following functions:
Finds the square root of a number
Finds the sin (trigonometry) of a number. [Note: Feel free to use the MATH class]
Finds the cosine (trigonometry) of a number. [Note: Feel free to use the MATH class]
Finds the tangent (trigonometry) of a number. [Note: Feel free to use the MATH class]
Finds the factorial (!) of the number
Submit a link to your GitHub repository 
 *
 */
public class CalculatorMain {

	public static void main(String[] args) {

		Calculator myCall = new Calculator(); // creating Calculator object
		System.out.println("\n\t Calling Calculator's Methods :\t");
		System.out.println("\t Adding:\t" + myCall.add(2, 3));
		System.out.println("\t Subtracting:\t" + myCall.subtract(5, 3));
		System.out.println("\t Multiplying:\t" + myCall.multiply(5, 3));
		System.out.println("\t Squaring:\t" + myCall.square(5));

		MagicCalculator myMagicCal = new MagicCalculator();  // creating MagicCalculator object
		System.out.println("\n\t Calling Calculator's Methods :\t");
		System.out.println("\t Squareroot :\t" + myMagicCal.sqroot(8));
		System.out.println("\t Sing :\t" + myMagicCal.sin(6));
		System.out.println("\t Tangent:\t" + myMagicCal.tangent(6));
		System.out.println("\t Factorial:\t" + myMagicCal.factorial(6));

	}
}