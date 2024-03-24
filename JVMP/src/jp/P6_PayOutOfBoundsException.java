//6. Program to create a user defined exception say Pay out of Bounds. 

package jp;

class PayOutOfBoundsException extends Exception {
    private static final long serialVersionUID = 1L;
	public PayOutOfBoundsException(String message) {
        super(message);
    }
}

public class P6_PayOutOfBoundsException{
	
	public void calculateSalary(double pay) throws PayOutOfBoundsException {
        if (pay < 0 || pay > 100000) { 
            throw new PayOutOfBoundsException("Pay out of bounds: " + pay);
        } else {
            System.out.println("Salary calculated successfully!");
        }
    }
	
    public static void main(String[] args) {
    	 P6_PayOutOfBoundsException calculator = new  P6_PayOutOfBoundsException();
        
        try {
            double pay = 120000;
            calculator.calculateSalary(pay);
        } catch (PayOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}