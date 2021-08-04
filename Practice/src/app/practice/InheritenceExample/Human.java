package app.practice.InheritenceExample;

public class Human {
	protected double height; //Variable is protected because child should see it
	protected String name; 
	protected int age;
	
	

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() { 
		return "Human [height=" + height + ", name=" + name + ", age=" + age + ", getHeight()=" + getHeight()
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public Human() {
		this(0, "", 0);
	}


	public Human(double height, String name, int age) {
		super();
		this.height = height;
		this.name = name;
		this.age = age;
	}

	public void whoAmI(){
		System.out.println("I am human");
		System.out.println(this); //means current class and will be converted into .toString()
	}
	
	public void schoolYear() {
		System.out.println("School year is not there");
	}
	
	public void schoolYear(int x) {
		System.out.println("School year is " + x);

	}
	
	
	




}
