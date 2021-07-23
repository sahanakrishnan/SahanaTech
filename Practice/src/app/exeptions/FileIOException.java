package app.exeptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOException {
    public static void main(String args[]) throws CustomException {
        File file = new File("E://file.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println(e.getMessage());
        } catch ( Exception e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch ( ArrayIndexOutOfBoundsException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
        } catch ( Exception e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("Exception" + e.getMessage());
        }
        int x = 5;
        if(x == 5){
            throw new CustomException("Sahana's Exception");
        }
        
    }

}
