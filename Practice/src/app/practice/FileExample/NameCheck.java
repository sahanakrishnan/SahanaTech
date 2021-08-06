package app.practice.FileExample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class NameCheck {

	public NameCheck() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/sahanakrishnan/Documents/nameCheck.txt");
		String[] names = {"Sahana, Ram","Shiva, Ram", "Sushma, Narayan", "leo, Narayan" };
		HashMap<String, String> nameHash = new HashMap<String, String>(); 
		
		 FileWriter writer = new FileWriter(f);
		 for( int i = 0; i < names.length; i++) { // loop through names array 
//			 System.out.println(names[i]);
			 writer.write(names[i] + "\n"); // write to file 
			

		       
		 }
		 writer.close();
		 
		 Scanner reader = new Scanner(f);
		 while(reader.hasNextLine()){ // loop through file
//			 read every line
			 String data = reader.nextLine();
			 data = data.toLowerCase(); //  make name lower case
			 String[] nameSplit = data.split(",");//split
			 nameSplit[0] = nameSplit[0].trim();
			 nameSplit[1] = nameSplit[1].trim();
			 if (nameHash.containsKey(nameSplit[1])) { //check if in hashmap (key is last name [1], value is first name [0])
				 String value = nameHash.get(nameSplit[1]); 
				 value = value + " " + nameSplit[0];
				 nameHash.put(nameSplit[1], value); //add to existing hashmap  
				 }
			 else { // else not in hashmap
				 nameHash.put(nameSplit[1], nameSplit[0]); //create new in hashmap 
	        		
	        		
	        		
	        		
	        	}
	     }
		  

	}

}
