package app.Casting;

public class MainClass1 {
    public static void main(final String[] args) {
        final MainClass1 total =  new MainClass1();

        final Area squareArea = new Square();
        total.printArea(squareArea);
        
        final Area rectangleArea = new Rectangle();
    
        total.printArea(rectangleArea);
        total.printRecArea((Rectangle)rectangleArea);

        final Square square = new Square();
        total.printArea(square);

        final Rectangle rectangle = new Rectangle();
        total.printArea(rectangle);
    }

    public void printArea(final Area a) {
        a.printArea();
        System.out.println(a.getClass());
        a.printClassName();
    }

    public void printRecArea(final Rectangle r) {
            r.printArea();
    }

    
}
    

    

