package app.staticPack;

public class StaticBlocks {

    static {
        System.out.println("In static block"); //to initialize something, put it in static
    }

    public static void main(String[] args) {
        System.out.println("In Main class");
    }

}