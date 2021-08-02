package app.ownPractice;

import java.util.Date;

public class myThread extends Thread{
    public static int threadCount;

    public void blockingFunction() {
        System.out.println("Start " + (new Date()));

        try {
            threadCount++;
            Thread.sleep(5000);
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("End " + (new Date()));
    }

    public void run(){
        blockingFunction();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start in main" + (new Date()));
        myThread te = new myThread();
        te.start();
        myThread te1 = new myThread();
        te1.start();
        myThread te2 = new myThread();
        te2.start();
        
        while(te.isAlive() || te1.isAlive() || te2.isAlive()){
            System.out.print(".");
            Thread.sleep(10);
    
        }
        System.out.println();
        System.out.println("Amount is " + threadCount);
        System.out.println("End in main" + (new Date()));
        
        
    }


}