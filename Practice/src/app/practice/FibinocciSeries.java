package app.practice;

public class FibinocciSeries {

	public FibinocciSeries() {
		// TODO Auto-generated constructor stub
	}
	
	public static int fibinocci(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fibinocci(n - 1) + fibinocci(n - 2);
		}
				
	}

	public static void main(String[] args) {
		int n = 20;
		
		for (int i = 0; i < n; i++) {
			  
            System.out.print(fibinocci(i) + " ");
        }

	}

}
