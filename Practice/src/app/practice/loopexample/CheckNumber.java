package app.practice.loopexample;

public class CheckNumber {

	public CheckNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(isNumeric("5"));
		System.out.println(isNumeric("Abc"));


	}

	public static boolean isNumeric(String s) {
		if (s == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(s);
			
		}
		catch (NumberFormatException e) {
			return false; 
			
		}
		
		return true;
	}
}
