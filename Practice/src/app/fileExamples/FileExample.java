package app.fileExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) throws IOException { //always do throw and catch
        File f = new File("/Users/sahanakrishnan/Documents/hello.txt"); //do not need to specify like this 

        System.out.println(f.exists());

        if (!f.exists()) {
            try {  // also has to do try and catch or throw in order to read/write/change files.
                f.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return;
            }
        }
        System.out.println("does file exist?" + f.exists());
        System.out.println("this finds where the file is " + f.getAbsolutePath());
        System.out.println("getting the file name" + f.getName());
        System.out.println("finding the length of the file" + f.length());

        FileWriter fW = new FileWriter(f);
        fW.write("Helo, My name is Sahana");

        fW.close();

        System.out.println("using scanner");
        Scanner reader = new Scanner(f);
        while(reader.hasNextLine()){
            String data = reader.nextLine();

            System.out.println(data);
        }

        System.out.println("using buffered reader");
        FileReader fR = new FileReader(f);
        BufferedReader bR = new BufferedReader(fR);
        String line = bR.readLine();
        while(line != null){
            System.out.println(line);
            line = bR.readLine();


        }
        bR.close();


        System.out.println(f.length());

        f.delete();
        System.out.println(f.exists());


        

        
    }

}