package app.practice.ArraysExample;

public class ReverseString {

	public ReverseString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String name = "Sahana";
		String reverse = "";
		
		for(int i = 0; i < name.length(); i++) {
			reverse = name.substring(i, i + 1) + reverse;
			System.out.println(reverse);
			
		}
		// TODO Auto-generated method stub

	}

}
