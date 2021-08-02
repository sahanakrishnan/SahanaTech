package app.Casting;

public class MainClass {
    public static void main(String[] args) {
        MainClass m =  new MainClass();

        Fruit appleFruit = new Apple();
        m.printColor(appleFruit);
        
        Fruit orangeFruit = new Orange();   //because theres a parent, you need to cast it like ((Orange)orangeFruit);
        m.printColor(orangeFruit);
        System.out.println("-------------------");
        m.printOrange((Orange)orangeFruit); //this function will call the ORANGE argument 
        m.printOrange(orangeFruit); //this will call the FRUIT argument
        System.out.println("-------------------");
        
        Apple apple = new Apple();
        m.printColor(apple); //Apple will be converted into  a fruit

        Orange orange = new Orange(); //because orange is still the same instant, you do not need to cast
        m.printColor(orange);
        m.printOrange(orange);

        Fruit appleFruit1 =  apple;
        Fruit orangeFruit1 = orange;


        // When you convert from a child to parent, you need to Cast..similar to narrowing
        Orange O1 = (Orange)orangeFruit1; 
        Apple A1 = (Apple)appleFruit1; 
        //Apple ARunTimError = (Apple)orangeFruit1;  This will fail runtime 

    }  //Everytime this function is called, all child objects will be converted to Parent i.e fruit
    public void printColor(Fruit f){ 
        f.printColor();
        System.out.println(f.getClass());
        
    }
    public void printOrange(Orange f){ //Print ORANGE is overloaded
    	System.out.println("Accepts Orange Argument");
        f.printColor();
    }
    
    public void printOrange(Fruit f){ 
    	System.out.println("Accepts Fruit Argument");
        f.printColor();
    }
}