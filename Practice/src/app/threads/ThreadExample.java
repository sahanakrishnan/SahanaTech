package app.threads;

import java.util.Date;

public class ThreadExample extends Thread{
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
        ThreadExample te = new ThreadExample();
        te.start();
        ThreadExample te1 = new ThreadExample();
        te1.start();
        ThreadExample te2 = new ThreadExample();
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