package app.wrapperClasses;

public class StringExample {
    public static void main(String[] args) {
        String s  = "Hello";

        System.out.println(s.toUpperCase());
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s); //s value will not change just because you put upper case, you have to assign it
        System.out.println(s.toLowerCase());   
        System.out.println(s.indexOf("e")); //location
        String txt = "My name is \"Sahana\" and I am 18.";
        System.out.println(txt);

    }

}