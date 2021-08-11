package app.practice.ArraysExample;

public class SecondLargest{  
	public static int seclarg(int[] a){  
		int temp;  
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {  
				if (a[i] > a[j]) {  
					temp = a[i];  
					a[i] = a[j];  
                    a[j] = temp;  
                    }  
				}  
			}  
		return a[a.length-2];
		}  
	public static void main(String args[]){
		int[] arr1={7,5,6,1,4,2}; 
		System.out.println(seclarg(arr1));  
}}  
