package app.threads;

import java.util.Date;

public class noThread {

    public void blockingFunction() {
        System.out.println("Start " + (new Date()));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("End " + (new Date()));
    }
    public static void main(String[] args) {
        System.out.println("Start in main" + (new Date()));


        noThread t = new noThread();
        t.blockingFunction();
        t.blockingFunction();
        t.blockingFunction();
        
        System.out.println("End in main" + (new Date()));

        
    }

}