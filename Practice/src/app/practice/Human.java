package app.practice;

public class Human {
	public String name; 
	public double height; 
	public double weight;
	public String sex;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() { 
		return "Human [height=" + height + ", name=" + name + ", getHeight()=" + getHeight()
				+ ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Human() {
		System.out.println("human default constructor");
	}

	public void BMI(double height, double weight) {
		double denom = Math.pow(height, 2);
		double BMI = (weight / (denom)) * 703;
		
		System.out.println("BMI is " +  BMI);
		
	}
	
	public static void printHuman(Human human){
		System.out.println(human); 
		}
	
	public int myMethod(int x) {
		return x * 2;
	} 
	public double myMethod(int x, int y){
		return x * y; 
	}
	public String myMethod(String x, String y) {
		return x + y;
	}
}
