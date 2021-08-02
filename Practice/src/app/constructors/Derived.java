package app.constructors;

public class Derived extends Base {
    public Derived(){
        //even tho there is no call to super, the super will be automatically called
        
        //this("");
        System.out.println("Derived default constructor");
    } 

    public Derived(String s){ 
//    	super(s);  //if super is not there it will call super WITHOUT arguments...super()
        //even tho there is no call to super, base default constructor is called
        System.out.println("Derived w string " + s);
    } 

}