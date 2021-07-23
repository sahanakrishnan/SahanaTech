package app.Casting;

public class MainClass {
    public static void main(String[] args) {
        MainClass m =  new MainClass();

        Fruit appleFruit = new Apple();
        m.printColor(appleFruit);
        
        Fruit orangeFruit = new Orange();   //because theres a parent, you need to cast it like ((Orange)orangeFruit);
        m.printColor(orangeFruit);
        m.printOrange((Orange)orangeFruit);

        Apple apple = new Apple();
        m.printColor(apple);

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
    public void printOrange(Orange f){ 
        f.printColor();
    }
}