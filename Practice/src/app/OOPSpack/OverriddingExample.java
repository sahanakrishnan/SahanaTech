package app.OOPSpack;

public class OverriddingExample {

	public OverriddingExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Animal a =  new Animal();
		Pig p = new Pig();
		a.makeSound();
		//a.sayName(); cannot call because it is private, but in child it is public
		p.makeSound();
		p.sayName(); //this is private in animal, but public in pig
		p.parentFunction(); //this function is not in pig 
		// TODO Auto-generated method stub

	}

}
