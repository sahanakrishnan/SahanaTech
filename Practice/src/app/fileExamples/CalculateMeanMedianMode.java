package app.fileExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class CalculateMeanMedianMode {

    private double mean = 0;
    private double median = 0;
    private Double mode = null; // Primative cannot be set to NUll. So changed to Object i.e., Double.
    private double standardDeviation = 0; // has to be static to be accessed inside as a static function

    private void calculateStat(Double[] numbers){
        double total = 0;
        //caluculate mean median mode and set values 
        for(int i=0; i<numbers.length; i++){
            total = total + numbers[i];
        }
        mean = total/ numbers.length;
        //calculate median 

        Arrays.sort(numbers);

        if (numbers.length % 2 == 0){
            int firstNumPos = numbers.length / 2;
            int secondNumPos = firstNumPos - 1; 

            median = (numbers[firstNumPos] + numbers[secondNumPos]) / 2; 

        }else{
            int evenMean = numbers.length / 2;

            median = numbers[evenMean];
        }

        //double maxValue = 0;
        mode = 0.0;
        int maxCount = 1;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
               if (numbers[j] == numbers[i]){
                   count++;
               }
               
            } //end of for loop j 
            if (count > maxCount){
                int maxPosition = i;
                mode = numbers[maxPosition];
            }
        } //end of for loop i 

        //calulate STD 

        for(int i=0; i<numbers.length; i++){
            standardDeviation = standardDeviation + Math.pow(numbers[i] - mean, 2);
        }
        standardDeviation = Math.sqrt(standardDeviation/numbers.length);
    }








  

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("/Users/sahanakrishnan/Documents/num.txt");
        ArrayList<Double> a = new ArrayList<Double>();

        Scanner reader = new Scanner(f);
        while(reader.hasNextLine()){
            String data = reader.nextLine();

            System.out.println(data);
            a.add(Double.parseDouble(data));
        }
        //Double[] doubleArray = (Double[])a.toArray();
        Double[] doubleArray = new Double[a.size()]; 
        for (int i = 0; i < doubleArray.length; i++) { 
            doubleArray[i] = a.get(i).doubleValue();
        }
        System.out.println(a);

        CalculateMeanMedianMode c = new CalculateMeanMedianMode();

        c.calculateStat(doubleArray);

        System.out.println(c.mean);
        System.out.println(c.median);
        System.out.println(c.mode);
        System.out.println(c.standardDeviation);








        
    }
    

}