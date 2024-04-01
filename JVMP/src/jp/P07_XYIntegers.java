//7. Program to assign two integer values to X and Y. Using the ‘if’ statement the output  of the program should display a message whether X is greater than Y. 

package jp;

public class P7_XYIntegers {

	public static void main(String[] args) {
		int X = 45;
		int Y = 46;
		
		if(X != Y) {	
			
		if(X > Y) System.out.println("X : "+X+" is greater than Y : "+Y);
		else System.out.println("X : "+X+" is lesser than Y : "+Y);
		
		}else {
			
			System.out.println("Both X and Y are Equal : "+Y);
			
		}
	}

}
