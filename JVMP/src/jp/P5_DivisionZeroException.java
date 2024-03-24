//5. program to demonstrate a division by zero exception
package jp;

public class P5_DivisionZeroException {

	public static void main(String[] args) {
		try {
			int numerator = 10;
			int denominator = 0;
			int result = numerator/denominator;
			System.out.println("The result : "+result);
		}catch(ArithmeticException e) {
			System.err.println("Division By Zero Exception Caught : "+e.getMessage());
		}

	}

}
