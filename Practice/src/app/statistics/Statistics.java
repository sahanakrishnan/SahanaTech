package app.statistics;

import java.util.Arrays;

public class Statistics {
    private double mean = 0;
    private double median = 0;
    private Double mode = null; // Primative cannot be set to NUll. So changed to Object i.e., Double.
    private static double standardDeviation = 0; // has to be static to be accessed inside as a static function

    private void calculateStat(double[] numbers){
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

    public double calculateMode(double[] numbers){
        calculateStat(numbers);
        return mode;
    }

    protected double calculateMean(double[] numbers){
        calculateStat(numbers);
        return mean;
    }

    double calculateMedian(double[] numbers){
        
        calculateStat(numbers);
        return median;
    }

    public static double calculateSTDdev(double[] numbers){ 
        //calculateStat(numbers);  cannot access nonstatic functions inside static
        Statistics s = new Statistics();
        s.calculateStat(numbers); //we cannot access nonstatic functions inside static so we have to recreate
        return standardDeviation; // has to be static to be accessed inside as a static function
    }
}