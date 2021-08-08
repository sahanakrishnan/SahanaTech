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


        String s1="Javatpoint";    
        String substr = s1.substring(0); // Starts with 0 and goes to end  
        System.out.println(substr);  
        String substr2 = s1.substring(5,10); // Starts from 5 and goes to 10  
        System.out.println(substr2);    
//        String substr3 = s1.substring(5,15); // Returns Exception 
        
        String str = "geeks@for@geeks";
        String[] aar = str.split("@", 2);
        System.out.println(aar[0] + " " + aar[1]); 
        
        String[] aar1 = str.split("@");
        System.out.println(aar1.length);  
        System.out.println(aar1[0] + " " + aar1[1] + " " + aar1[2]); 


    }

}