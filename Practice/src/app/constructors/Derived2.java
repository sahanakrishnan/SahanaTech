package app.constructors;

public class Derived2 extends Base {
    public Derived2(){
        //it will not call super, because it has super in the chaining. 
        this(""); 
        System.out.println("Derived2 default constructor");
    } 

    public Derived2(String s){ 
        super(s); //since super is called, it will not call super w default constructor 
        System.out.println("Derived2 w string " + s);
    }

}