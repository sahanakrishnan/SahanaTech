package app.practice.OddCustomException;

import app.exeptions.CustomException;

public class OddCustomExceptionExample {

	
	public void isOdd(int[] numArray){
		for(int i = 0; i < numArray.length; i++) {
			try {
				if (numArray[i] % 2 == 0) {
					System.out.println(numArray[i]);
				} 
				else {
					 throw new CEexample("error: odd Number"); 
					
					}
				
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
			
		}

	}
	

	public static void main(String[] args) {
		int[] numArray = {1,2,3,4,5,6,7,8,9};
		OddCustomExceptionExample od = new OddCustomExceptionExample();
		od.isOdd(numArray);

	}

}
