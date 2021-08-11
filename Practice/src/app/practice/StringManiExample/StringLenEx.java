package app.practice.StringManiExample;

public class StringLenEx {

	public static int len(String str) {
	  int length = 0;
	  char[] strCharArray = str.toCharArray();
	  for (char c:strCharArray) {
		  length++;
		  }
	  return length;
	  }
	

	public static void main(String[] args) {
		String str = "This is Sahana Krishnan";
		System.out.println(len(str));
		}
}


