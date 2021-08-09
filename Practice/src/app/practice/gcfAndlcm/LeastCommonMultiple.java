package app.practice.gcfAndlcm;

public class LeastCommonMultiple {
	public static int findGcd(int x, int y) {  
	if (x == 0) { 
		return y;  
	}
	return findGcd(y % x, x);  
	}  
	
	
	public static int findLcm(int x, int y) {  
		return (x / findGcd(x, y)) * y;  
	}  
	

	public static void main(String[] args) {
		int num1=50;
		int num2=60;
		System.out.println("LCM of " + num1 +" and " + num2 +" is " + findLcm(num1, num2));  
	}

}
