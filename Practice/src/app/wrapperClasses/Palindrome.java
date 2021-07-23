package app.wrapperClasses;

public class Palindrome {
    public void checkPalindrome(String s){
        String sReverse = "";
        for (int i = s.length(); i > 0 ; i-- ){
            //System.out.println(s.substring(i-1, i));
            sReverse = sReverse + s.substring(i-1, i);
        

        }
        //System.out.println(sReverse);
        if (s.equals(sReverse)) {
            System.out.println(s + " is a palindrome");
        }
        else{
            System.out.println(s + " is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.checkPalindrome("abc");
        p.checkPalindrome("aba");
        
    }

}