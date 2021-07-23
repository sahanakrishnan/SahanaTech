package app.myPackage;

public class MainInPackage {
    public static void main(String[] args) {
        System.out.println("Hellow");
        FileInSamePackage f = new FileInSamePackage(); // Notice no Import
    }

}