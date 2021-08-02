package app.OOPSpack;

public class OverloadingExample {

	public OverloadingExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		a.myMethod(5);
		a.myMethod(5, 9);
		a.myMethod(5.0, 9.0);
		// TODO Auto-generated method stub

	}

}
