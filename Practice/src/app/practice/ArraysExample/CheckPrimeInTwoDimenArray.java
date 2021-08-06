package app.practice.ArraysExample;
import java.util.*;
public class CheckPrimeInTwoDimenArray {


	public CheckPrimeInTwoDimenArray() {
		// TODO Auto-generated constructor stub
	}
    public static void checkPrime(Integer num, ArrayList<Integer> primeNumbers) {
    	boolean prime = true;
    	if(num ==0 || num == 1) {
    		prime = false;
    		
    	} else {
    		for (int i = 2; i < num-1; i++) {
                if (num % i == 0) {
                	prime = false;
                }
            }    		
    	}
    	if(prime==true) {
    		primeNumbers.add(num);
    	}
 
    	
    }
	public static void main(String[] args) {
		int[][] doubleArray = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayList<Integer> singleDim = new ArrayList<Integer>();
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for (int i = 0; i < doubleArray.length; i++) {
			for(int j = 0; j < doubleArray[i].length; j++) { // need doubleArray[i]
//				System.out.println(doubleArray[i][j]); // remember to take from i,j

					
			   checkPrime(doubleArray[i][j], primeNumbers);		
	
//				check for prime and print number is prime 
				
//				add to arraylist 
				
				
			} // For Loop for J
		} // For Loop for J
		System.out.println(primeNumbers);
	}

}
