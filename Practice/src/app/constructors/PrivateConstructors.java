package app.constructors;

public class PrivateConstructors {

    private PrivateConstructors(){ //private can be accessed within the class but not outside the class
        System.out.println("default constructor");

    }

    public PrivateConstructors(int x){
        this();
        System.out.println("int constructor");
        
    }

}