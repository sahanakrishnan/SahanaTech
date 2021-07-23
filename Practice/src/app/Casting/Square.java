package app.Casting;

public class Square extends Area {
    double side = 5.0;
    double area1 = side * side;
    public double getArea(){
        return (area1); 
    };

    public void printArea(){
        System.out.println("Area is" + area1);
    };
}