package app.arrays;

import java.util.ArrayList;

import app.exeptions.CustomException;

public class ArraysExample {
    private static boolean checkPrime(double n){
        if (n == 0 || n == 1) {
            return false;
        } 
        
        for (int i = 2; i < n-1; i++) {
            if (n % i == 0) {
                return false;
            }
//            return true;
        }
        return true; 

    }

    public static void main(String[] args) {
        double[] x = {1, 4, 8, 0, 2, 3};
        double y = 10;

        //for (int i = 0; i < x.length; i++){
        for (double valX : x){ //
            try {
                //double valX = x[i];
                double val = (double)Math.round((y/valX) *100)/ 100;
                System.out.println("value is: " + val);
                boolean isPrime = checkPrime(valX);
                if (isPrime == true){ //if (isPrime) no need for "=="
                    throw new CustomException("prime number"); 
                }
            } catch (ArithmeticException e) {
                System.out.println(
                    "ERR ArithmeticException: " + e.getMessage());
    
            } catch (CustomException e) {
                System.out.println(
                    "ERR CustomException: " + e.getMessage());
    
            } catch ( Exception e) {
    
                System.out.println(
                    "ERR Exception: " + e.getMessage());
            } // End of Exceptions
        } // End of FOR LOOP
            
         
    }
}

//Create array
// X = 1, 4, 8, 0, 2, 3
// And
// Y = 10

// Calculate Y / x and print after rounded by two digits.


// Throw Custom Exception if X prime number. Write a separate function to check prime and call in for loop


// Also Catch Arithmetic exception i.e divide by 0.