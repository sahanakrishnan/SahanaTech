package app.constructors;

public class Main {
    int x; //integer is defaulted to 0 
    public Main(){ //this will be there in all classes by default
        this(5);
        System.out.println("no args constructor");

    } // if this gets commented out then it will give an error to Main m = new Main();  as java
    // thinks you are creating your own constructor and will not create a default 

    public Main(int num){
        System.out.println("int constructor");
        this.x = num; 

    }

    public Main(Integer num){  //not be called because java takes int over Integer
        System.out.println("Integer constructor");
        this.x = num; 

    }

    public Main(String num){ 
        System.out.println("String constructor");
        this.x = Integer.parseInt(num); 

    }
    public static void main(String[] args) {
         Main m = new Main();
         System.out.println(m.x);

         Main m1 = new Main(5);
         System.out.println(m1.x);

         Square s = new Square();

        // PrivateConstructors pC = new PrivateConstructors(5);
        // //PrivateConstructors pC = new PrivateConstructors(); this cannot be accessed as this constructor is private
        //Derived d =  new Derived();
//        Derived d2 =  new Derived("s");
        Derived2 d22 =  new Derived2();
    }



}