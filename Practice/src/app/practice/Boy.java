package app.practice;

public class Boy extends Human {
	public Boy(String name, double height, double weight, String sex) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.sex= sex;
		
		System.out.println("boy constructor");
		
	}
	
	public Boy() {
		this("",0.0,0.0,"Man");	
		System.out.println("boy default constructor");
		
	}
	public int myMethod(int x) {
		return (int) Math.pow(x, 3);
	} 


	public static void main(String[] args) {
		

	}

}
