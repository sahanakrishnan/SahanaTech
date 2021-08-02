package app.OOPSpack;

import java.io.*;

public class Pig extends Animal {
//when you inherit the methods will be available n the child, but constreuctors will not be 
	public Pig() {
		System.out.println("Pig created");
		// TODO Auto-generated constructor stub
	}
	
	public void makeSound() {
		System.out.println("Pig SOund");
	}
	
	public void sayName() { //this cannot be private because parent is public, child cannot be private
		System.out.println("I am pig");
	}
	
	public void myMethodThrowsEX() throws FileNotFoundException {
		
	}
	
//	public void myMethodThrowsEX() throws Exception {
//		
//	} this method is not allowed because it is getting widened

}
