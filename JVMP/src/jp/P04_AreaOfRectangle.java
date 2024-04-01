//4. Program to find the area of rectangle. 

package jp;

import java.util.Scanner;

public class P4_AreaOfRectangle {

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle :");
		float length = in.nextFloat();
		System.out.print("Enter the breadth of the rectangle :");
		float breadth = in.nextFloat();
		System.out.print("The Area of the rectangle is :"+(length*breadth)+" sq units");
		in.close();
	}

}
