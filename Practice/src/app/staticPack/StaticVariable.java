package app.staticPack;

public class StaticVariable {
    int x = 10;
    static int statX = 20;

    public int getX(){
        return x;
    }

    public static int getStaticX(){
        //x = 15; cannot access x because x is nonstatic
        return statX;
    }
    public static void main(String[] args) {
        statX = 30;
        System.out.println("accessing without instance" + getStaticX()); //can access static variable without creating an instance
        //x = 20; cannot access x as its a nonstatic variable, inside a static function
        //getX(); cannot access nonstatic functions.
        System.out.println("accessing without instance" + StaticVariable.getStaticX());
        StaticVariable nonStaticClass = new StaticVariable();
        System.out.println("accessing non static variable" + nonStaticClass.x);
        System.out.println("accessing non static function" + nonStaticClass.getX());
        System.out.println("accessing non static function" + statX);
        statX = 40; // when static variable is changed to 40 all existing classes will have 40. 
        System.out.println("accessing non static function" + statX);
        System.out.println("accessing without instance" + getStaticX());
        System.out.println("accessing without instance" + nonStaticClass.getStaticX());

        Car tesla = new Car("Tesla");
        Car GMC = new Car("GMC");
        Car Toyota = new Car("Toyota");
        System.out.println("total number of cars " + Toyota.numCars); //static will make sure that there are 3 cars.

    }

}