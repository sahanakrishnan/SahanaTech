package app.innerClass;

public class StaticInnerClass {
    static class nestedDemo{ //this is a static class 
        public void myMethod(){
            System.out.println("this is inside static class");
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.nestedDemo NESTED = new StaticInnerClass.nestedDemo(); //this is a type of instantiation
        NESTED.myMethod();

    }

}