//12. Program 
//a. To find the area and circumference of the circle by accepting the radius from the user.  

package jp;

import java.util.Scanner;
import java.lang.Math;

public class P12a_AreaAndCircumOfCircle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		double  radius = in.nextFloat();
		double area = Math.PI*radius*radius;
		double circum = 2*Math.PI*radius;
		System.out.println("The Area of the circle is : "+area);
		System.out.println("The Circumference of the circle is : "+circum);
		in.close();

	}

}
