package app.innerClass;

public class outerDemo {
    int x = 5;
    static int statX = 6;
    private int pvtX = 10;
    public class innerDemo{
        int y = 6;
        //static int statY = 6; cannot declare a static variable in a nonstatc class
        public void sayHello(){
            System.out.println("hello");
        }

        public int getNum(){ 
            return pvtX; // private variables can be accessed in the inner class with this function
        }
    }


}