package app.ownPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class StatisticFile {

    private double mean = 0;
    private double median = 0;
    private Double mode = null;
    private double standardDeviation = 0; 

    private void calculateStat(Double[] numbers){
        double total = 0;
        for(int i=0; i<numbers.length; i++){
            total = total + numbers[i];
        }
        mean = total/ numbers.length;
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------

        Arrays.sort(numbers);

        if (numbers.length % 2 == 0){
            int firstNumPos = numbers.length / 2;
            int secondNumPos = firstNumPos - 1; 

            median = (numbers[firstNumPos] + numbers[secondNumPos]) / 2; 

        }else{
            int evenMean = numbers.length / 2;

            median = numbers[evenMean];
        }

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------
        mode = 0.0;
        int maxCount = 1;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
               if (numbers[j] == numbers[i]){
                   count++;
               }
               
            }  
            if (count > maxCount){
                int maxPosition = i;
                mode = numbers[maxPosition];
            }
        } 

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------

        for(int i=0; i<numbers.length; i++){
            standardDeviation = standardDeviation + Math.pow(numbers[i] - mean, 2);
        }
        standardDeviation = Math.sqrt(standardDeviation/numbers.length);
    }


    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("/Users/sahanakrishnan/Documents/num.txt");
        ArrayList<Double> a = new ArrayList<Double>();

        Scanner read = new Scanner(f);
        while(read.hasNextLine()){
            String data = read.nextLine();

            System.out.println(data);
            a.add(Double.parseDouble(data));
        }
        Double[] doubleArray = new Double[a.size()]; 
        for (int i = 0; i < doubleArray.length; i++) { 
            doubleArray[i] = a.get(i).doubleValue();
        }
        System.out.println(a);

        StatisticFile sF = new StatisticFile();

        sF.calculateStat(doubleArray);

        System.out.println(sF.mean);
        System.out.println(sF.median);
        System.out.println(sF.mode);
        System.out.println(sF.standardDeviation);
        
    }
    

}