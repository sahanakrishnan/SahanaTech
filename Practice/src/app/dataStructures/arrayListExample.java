package app.dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import app.staticPack.Car;

public class arrayListExample {
    public static void main(String[] args) {
        //arrayList is created without specifying the type, so you can add anything, everything will be an object  
        ArrayList abc = new ArrayList();  
        abc.add("Sahana");   
        abc.add(15); 
        abc.add(true); 
        abc.add(new Car("Toyota"));
        
        System.out.println("==============> 1. Simple For loop Example."); 
        for (int i = 0; i < abc.size(); i++) {
            System.out.println(abc.get(i));
        }

        System.out.println("\n==============> 2. New Enhanced For loop Example..");
        for (Object temp : abc) {
            System.out.println(temp);
        }

        String first = (String)abc.get(0);

        ArrayList<String> StringArrayList = new ArrayList<String>();  
        StringArrayList.add("Sahana");   
        //StringArrayList.add(15); makes it into an index because it is not a string 
        //StringArrayList.add(true); true is not a string, it's a boolean
        //StringArrayList.add(new Car("Toyota")); it is an object 
        StringArrayList.add("Sahana");
        StringArrayList.add("Sahana");
        StringArrayList.add("Sahana");


        System.out.println("==============> 1. Simple For loop Example."); 
        for (int i = 0; i < StringArrayList.size(); i++) {
            System.out.println(StringArrayList.get(i));
        }

        System.out.println("\n==============> 2. New Enhanced For loop Example..");
        for (String temp : StringArrayList) {
            System.out.println(temp);
        }


        //convert array to arrayList
        String[] strArray = {"S","a","h","S","S","S",};
        List<String> list = Arrays.asList(strArray);    // note the variable is declared as list which is an interface of arraylist      
        System.out.println(list);
        System.out.println(list.getClass().getName());
        ArrayList<String> listToArrayList = new ArrayList<String>(list); //how to convert list to arrayList
        System.out.println(listToArrayList);

        ArrayList<String> list1 = new ArrayList<String>(); //doing addAll function in order to make arrayList work
        Collections.addAll(list1, strArray);
        System.out.println(list1);

        TreeSet<String> abcSet = new TreeSet<String>();
        abcSet.add("pink");
        abcSet.add("pink"); //any set is unique. doesn't allow duplicates

        System.out.println(abcSet);


    }

}