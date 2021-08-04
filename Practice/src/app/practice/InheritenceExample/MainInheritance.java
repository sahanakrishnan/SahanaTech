package app.practice.InheritenceExample;

public class MainInheritance {

	public MainInheritance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Human h = new Human( 5.9 ,"Sahana", 15);
		System.out.println(h);
		h.whoAmI();
		System.out.println(h.getClass().getName());
		
		Human boyHuman = new Boy( 5.9 ,"leo", 15);
		System.out.println(boyHuman);
		boyHuman.whoAmI();
		System.out.println(boyHuman.getClass().getName());
		
		if (boyHuman instanceof Boy) { //instanceof checks the type Boy or Human
			System.out.println("it is a boy");
		}
		String className = boyHuman.getClass().getName(); //gets the class name from getClass
		
		if (className.contains("Boy")) { //String check for the word boy..contains
			System.out.println("it is a boy");
		}
		
		if (className.indexOf("Boy") > -1) { //String check for the word boy..contains
			System.out.println("it is a boy index " + className.indexOf("Boy"));
		}


		
		

		// TODO Auto-generated method stub

	}

}
