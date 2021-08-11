package app.practice.ArraysExample;

import java.util.ArrayList;

public class OddEvenEx {

	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even.add(num[i]);
			}
			else {
				odd.add(num[i]);
			}
		}
		System.out.println(even);
		System.out.println(odd);


	}

}
