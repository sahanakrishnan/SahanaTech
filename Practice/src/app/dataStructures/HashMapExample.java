package app.dataStructures;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> abcMap = new HashMap<String, String>();
        abcMap.put("England","London");
        abcMap.put("Berlin","Germany");
        abcMap.put("Oslo","Norway"); 

        System.out.println(abcMap);

        System.out.println("Capital of England is " + abcMap.get("England")); //get gets the value of the key.
        System.out.println("Capital of England is " + abcMap.containsKey("England"));
        System.out.println("Capital of England is " + abcMap.containsKey("India")); //contains key wil give true or false

        abcMap.remove("Oslo");
        System.out.println(abcMap);
    }

}