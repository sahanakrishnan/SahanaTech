package app.statistics;

public class mean {
    public static void main(String[] args) {
        double[] number = {1,5,7,1,2,1,11,10};
        Statistics stats = new Statistics();
        System.out.println("Mode is " + stats.calculateMode(number)); 
        System.out.println("Mean is " + stats.calculateMean(number)); 
        System.out.println("Median is " + stats.calculateMedian(number)); 
        System.out.println("Standard Deviation is " + Statistics.calculateSTDdev(number)); //this one is a static function so no instantiaiton 
        
    }

}