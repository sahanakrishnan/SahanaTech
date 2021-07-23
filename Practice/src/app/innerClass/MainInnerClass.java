package app.innerClass;

public class MainInnerClass {
    public static void main(String[] args) {
        outerDemo OD = new outerDemo();
        outerDemo.innerDemo ID = OD.new innerDemo(); //variable declaration should be type outer class.inner class,
        // but when you do instantiation it should be OBJECT not class followed by new inner class

        ID.sayHello();
        System.out.println(OD.x + ID.y); //note how this is being accessed
        System.out.println(outerDemo.statX); //this is static can be accessed from the class directly and the object 
        System.out.println(OD.statX);
        //System.out.println(OD.pvtX);  cannot access because its private
        System.out.println(ID.getNum()); //access private variables with a getter function
        
        
    }

}