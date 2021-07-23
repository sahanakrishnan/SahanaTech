
public class MainClass1 {
    public static void main(final String[] args) {
        MainClass1 total =  new MainClass1();

        Area squareArea = new Square();
        total.printArea(squareArea);

        Area rectangleArea = new Rectangle();
        total.printArea(rectangleArea);
        total.printRecArea((Rectangle)rectangleArea);

        Square square = new Square();
        total.printArea(square);

        Rectangle rectangle = new Rectangle();
        total.printArea(rectangle);
    }

    public void printArea(final Area a) {
        a.printArea();
        System.out.println(a.getClass());

    }

    public void printRecArea(final Rectangle r){ 
            r.printArea();
    }

    
}
    

    

