/**10. Program to perform mathematical operations. Create a class called AddSub with methods to add and subtract. 
Create another class called MulDiv that extends from AddSub class to use the member data of the super class. 
MulDiv should have methods to multiply and divide A main function should access the methods and perform 
the mathematical operations.*/ 

package jp;

class AddSub{
	int a;
	int b;
	
	AddSub(int x,int y){
		this.a = x;
		this.b = y;
	}
	int add() {
		return a+b;
	}
	
	int subtract() {
		return a-b;
	}
	
}

class MulDiv extends AddSub{
	
	MulDiv(int x,int y){
		super(x , y);
	}
	int multiply() {
		return a*b;
	}
	int divide() {
		if(b == 0) {
			return 0;
		}
		return a/b;
	}
	
}
public class P10_MathInheretedClass {

	public static void main(String[] args) {
		int x = 77, y = 11;
		MulDiv z = new MulDiv(x,y);
		System.out.println("The Sum of "+x+" and "+y+" is : "+z.add());
		System.out.println("The Differnce of "+x+" and "+y+" is : "+z.subtract());
		System.out.println("The Product of "+x+" and "+y+" is : "+z.multiply());
		System.out.println("The Quotient of "+x+" and "+y+" is : "+z.divide());
		
	}

}
