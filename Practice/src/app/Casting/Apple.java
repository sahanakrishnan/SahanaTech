package app.Casting;

public class Apple implements Fruit {
    String appleColor = "red";
    public String getColor(){
        return appleColor;
    };
    public void printColor(){
        System.out.println("Color is" + appleColor);
    };
}