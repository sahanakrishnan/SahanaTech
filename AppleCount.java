import java.util.ArrayList;

public class AppleCount {
    public static void main(String[] args) {
        ArrayList<Fruit> fArray = new ArrayList<Fruit>();
        fArray.add(new Apple());
        fArray.add(new Orange());
        fArray.add(new Apple());
        fArray.add(new Orange());
        fArray.add(new Apple());
        fArray.add(new Orange());
        fArray.add(new Apple());
        int appleCount = 0; 
        int otherCount = 0;
        for (int i = 0; i < fArray.size(); i++) {
            Fruit f = fArray.get(i);
            //System.out.println(f.getClass());
            String className =  f.getClass().getName();
            System.out.println(className);

            if (className.equals("Apple")){
                appleCount++;
            }else{
                otherCount++;
            }
        }
        System.out.println("Count for apple " + appleCount);
        System.out.println("Count for other " + otherCount);
    }   
}