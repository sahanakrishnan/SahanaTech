package app.OOPSpack;

public class EncapsulationEx {
	private String name;
	private int age;
	
	

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

	public EncapsulationEx() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {  //if this method does not exist, it will print the name of the class
		return "EncapsulationEx [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		//no one can use the variables which are private, so you have to use getter setter method. 
		EncapsulationEx abc = new EncapsulationEx();
		abc.setAge(17);		
		abc.setName("Leo");
		System.out.println(abc);

	}

}
