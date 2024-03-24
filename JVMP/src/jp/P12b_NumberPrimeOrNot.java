//12. Program  
//b. To accept a number and find whether the number is Prime or not 

package jp;

import java.util.Scanner;

public class P12b_NumberPrimeOrNot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = in.nextInt();
		boolean flag = true;
		for(int i=2; i<= Math.sqrt(num); i++) {
			if(num%i == 0) {
				flag = false;
				break;
			}
		}
		if(flag) System.out.println(num+" is a prime number.");
		else System.out.println(num+" is not a prime number.");
		
		in.close();

	}

}
