package app.practice.gcfAndlcm;

public class GreatestCommonFactor {

	

	public static void main(String[] args) {
		int num1=50;
		int num2=60;
		
		while(num1!=num2)   
		{  
			if(num1>num2) {  
				num1=num1-num2;  
			}
			else {  
				num2=num2-num1;
			}
		}  
		System.out.printf("GCD of n1 and n2 is: " + num2);  
		}  

	}

