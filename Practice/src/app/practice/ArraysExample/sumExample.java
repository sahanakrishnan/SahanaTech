package app.practice.ArraysExample;

public class sumExample {

	public static void findPair(int[] arrayNum, int sum) {
		 for (int i = 0; i < arrayNum.length - 1; i++) {
			 for (int j = i + 1; j < arrayNum.length; j++) {
				 if (arrayNum[i] + arrayNum[j] == sum)
	                {
	                    System.out.println(arrayNum[i] + " + " + arrayNum[j] + " = " + sum);
//	                    return;
	                }
	            }
	        }
	 
	    }
				 
			 

	public static void main(String[] args) {
		int[] arrayNum = { 8, 7, 2, 5, 3, 1 };
//		int[] arrayNum = { 7, 3, 8, 2 };

        int sum = 10;
 
        findPair(arrayNum, sum);
	}

}
