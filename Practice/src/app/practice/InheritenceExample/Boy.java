package app.practice.InheritenceExample;

public class Boy extends Human {
	public void whoAmI()  {
		System.out.println("I am boy");
		System.out.println(this); //means current class and will be converted into .toString()
	}
	public Boy(double height, String name, int age) {
		super( height,  name,  age);
//		this.height = height;
//		this.name = name;
//		this.age = age;
	}


	public Boy() {
		// TODO Auto-generated constructor stub
	}

	

}
