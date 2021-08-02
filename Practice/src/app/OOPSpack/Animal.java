package app.OOPSpack;
import java.io.*;

public class Animal {

	public Animal() {
		System.out.println("animal created");
		// TODO Auto-generated constructor stub
	}
	
	public void makeSound() {
		System.out.println("Animal SOund");
	}
	
	private void sayName() {
		System.out.println("I am animal");
	}
	
	public void parentFunction() {
		System.out.println("I am the parent");
	}
	
	public void myMethod(int x) {
		System.out.println("my Method " + x);
		myMethod(x, 10.0); //went to the double,double myMethod
	}
	
	public void myMethod(int x, int y) {
		System.out.println("my Method " + x + " " + y);
	}
	
	public void myMethod(double x, double y) {
		System.out.println("my Method double " + x + " " + y);
	}
	
//	public int myMethod(double x, double y) {
//		return 1; 
//	} this cannot be possible due to duplicate
	
	public void myMethodThrowsEX() throws IOException {
		
	}

}
