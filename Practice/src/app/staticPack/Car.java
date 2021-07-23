package app.staticPack;

public class Car {
    private String name;
    public static int numCars;

    public Car(String name){
        this.name = name;
        numCars++;
        

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}