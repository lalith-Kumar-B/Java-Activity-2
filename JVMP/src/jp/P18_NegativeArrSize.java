//18. Program to catch Negative Array Size Exception. This exception is caused when the array is initialized to negative values. 


package jp;

public class P18_NegativeArrSize{
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        try {
            int[] arr = new int[-5]; 
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }
    }
}

/**
 Caught NegativeArraySizeException: -5
 */