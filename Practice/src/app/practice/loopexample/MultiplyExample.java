package app.practice.loopexample;

public class MultiplyExample{

	public MultiplyExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int x = 5;
//		for (int i = 1; i <= 12; i++ ) {
//			String s = String.valueOf(i);
//			System.out.println(x + " * " + i + " = " + (i * x));
//		}
		MultiplyExample me = new MultiplyExample();
		me.MultiplicationTable();
		
	}
	
	public void MultiplicationTable(int x) {
		for (int i = 1; i <= 12; i++ ) {
			String s = String.valueOf(i);
			System.out.println(x + " * " + i + " = " + (i * x));
		}

	}
	
	public void MultiplicationTable() {
		Integer[] num = {1,2,3,4,5,55,332,1};
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("-------------- Multiplication Table for " + num[i] + " ------");
			MultiplicationTable(num[i]);
			
		}
	}

}
