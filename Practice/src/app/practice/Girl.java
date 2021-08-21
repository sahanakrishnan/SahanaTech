package app.practice;

public class Girl extends Human {
	public Girl(String name, double height, double weight, String sex) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.sex= sex;
		
		System.out.println("girl constructor");
		
	}
	
	public Girl() {
		this("",0.0,0.0,"Woman");	
		System.out.println("girl default constructor");
		
	}
	public int myMethod(int x) {
		return (int) Math.pow(x, 3);
	} 


	public static void main(String[] args) {
		

	}

}
