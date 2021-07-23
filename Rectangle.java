
public class Rectangle implements Area {
    double length = 5.0;
    double width = 7.0;
    double area1 = length * width; 
    
    public double getArea(){
        return (area1); 
    };

    public void printArea(){
        System.out.println("Area is" + area1);
    };


}

