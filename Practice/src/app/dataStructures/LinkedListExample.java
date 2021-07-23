package app.dataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> abcLink = new LinkedList<String>();
        abcLink.add("Sahana");
        abcLink.add("Sahana1");
        abcLink.add("Sahana2");
        abcLink.add("Sahana3");

        System.out.println(abcLink);

        System.out.println("==============> 1. Simple For loop Example."); 
        for (int i = 2; i < abcLink.size(); i++) {
            System.out.println(abcLink.get(i));
        }

        System.out.println("\n==============> 2. New Enhanced For loop Example..");
        for (String temp : abcLink) {
            System.out.println(temp);
        }

        System.out.println("\n==============> 3.While loop with iterator..");
        Iterator i = abcLink.iterator(); //this is how you get the iterator
        while(i.hasNext()){
            System.out.println(i.next());

        }
        
    }

}