package app.practice.loopexample;

public class MultiplyExample{

	public MultiplyExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int x = 5;
		for (int i = 1; i <= 12; i++ ) {
			String s = String.valueOf(i);
			System.out.println(x + " * " + i + " = " + (i * x));
		}

	}

}
