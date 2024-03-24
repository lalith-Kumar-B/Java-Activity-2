//8. Program to list the factorial of the numbers 1 to 10. To calculate the factorial 
//value, use while loop. (Hint Fact of 4 = 4*3*2*1) 

package jp;

public class P8_FactorialFrom1to10 {

	public static void main(String[] args) {
		int i=1;
		int j,fact;
		while(i <= 10) {
			fact = 1;
			j = i;
			while(j != 0) {
				fact*= j;
				j--;
			}
			System.out.print(fact+" ");
			i++;
		}
	}

}
