package app.innerClass;

public class OuterAnonymous {
    public static void displayMessage(Message m){
        m.greet();
    }
    public static void main(String[] args) { // long way of doing this  
        Anonymous A = new Anonymous(){
            public void myMethod() {  
                System.out.println("inside Anonymous my Method");
            }
        };
        A.myMethod();

        ImplementAnonymous i = new ImplementAnonymous();
        i.myMethod();  //short cut 

        Message m = new Message(){
            public void greet(){
                System.out.println("Hello using interface as object");
            } 
        };

        displayMessage(m); //this one uses a variable 
        displayMessage( //this directly creates an object inside the parenthesis
            new Message(){
                public void greet(){
                    System.out.println("Hello no variable message");
                } 
            }


        );

    }

}