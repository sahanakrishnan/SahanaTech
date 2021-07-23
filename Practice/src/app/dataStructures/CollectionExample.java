package app.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionExample {
    public static void main(String[] args) {
        String[] strArray = {"hello","morning","calculate"};
        //Collections.addAll(list1, strArray); 
        ArrayList<String> list1 = new ArrayList<String>(); 
        Collections.addAll(list1, strArray);
        System.out.println(list1);

        Arrays.sort(strArray); //there is an arrays objects 
        System.out.println(Arrays.toString(strArray)); 

        Collections.sort(list1); // do to lists you need collections 
        System.out.println(list1);

        Collections.sort(list1, Collections.reverseOrder()); //there is sort and reverse sort 
        System.out.println(list1);
    }

}