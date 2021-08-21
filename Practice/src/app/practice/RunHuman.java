package app.practice;

public class RunHuman {

	public RunHuman() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Track Constructor chaining with System.out.println.
//		Create a Boy and assign it to a Human.
		Human b = new Boy();
//		Create a Girl and assign it to a Human.
		Human g = new Girl();
//		Call method printHuman passing Boy, Girl
		Human.printHuman(b);
		Human.printHuman(g);
//		Reconvert Human back to Boy and girl.
		Boy b1 = (Boy) b;
		Girl g1 = (Girl) g;
	
//		Call method printHuman passing Boy, Girl ( Narrowing cast call)
		Human.printHuman(b1);
		Human.printHuman(g1);

	}

}
