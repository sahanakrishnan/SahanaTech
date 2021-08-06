package app.practice.DataStructureExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Names {

	public Names() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] names = {"Sahana, Ram","Shiva, Ram", "Sushma, Narayan", "leo, Narayan" };
		HashMap<String, String> nameHash = new HashMap<String, String>(); 
		HashMap<String, Integer> numberName = new HashMap<String, Integer>(); 
		HashMap<String, ArrayList<String>> nameArrayHashMap = new HashMap<String, ArrayList<String>>(); 
		ArrayList<String> names2 = new ArrayList<String>(); 
        Collections.addAll(names2, names);
//        System.out.println(names2);
        
        for( int i = 0; i < names2.size(); i++) {
        	String nameStr = names2.get(i);
        	nameStr = nameStr.toLowerCase();
        	String[] nameSplit = nameStr.split(", ");
//        	System.out.println(nameSplit[0]);
        	
        	if (nameHash.containsKey(nameSplit[1])) {
        		String value = nameHash.get(nameSplit[1]);
        		value = value + " " + nameSplit[0];
        		nameHash.put(nameSplit[1], value);
        		Integer count = numberName.get(nameSplit[1]);
        		count++;  // this needs to be outside not inside the put. 
        		numberName.put(nameSplit[1], count);
        		ArrayList<String> firstArray = nameArrayHashMap.get(nameSplit[1]);
        		firstArray.add(nameSplit[1]);
        		nameArrayHashMap.put(nameSplit[1], firstArray);
        	
        		
        	}
        	else {
        		nameHash.put(nameSplit[1], nameSplit[0]);
        		numberName.put(nameSplit[1],1);
        		ArrayList<String> firstArray = new ArrayList<String>();
        		firstArray.add(nameSplit[0]);
        		
        		nameArrayHashMap.put(nameSplit[1], firstArray);
        		
        		
        	}
        	
        	
        	
        }
        
        System.out.println(nameHash);
        System.out.println(numberName);
        System.out.println(nameArrayHashMap);
        
		
		 	
	}
	

}
