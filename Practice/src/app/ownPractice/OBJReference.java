package app.ownPractice;

public class OBJReference {
    int age = 18;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void modifyObject(OBJReference obj) {
        obj.setAge(12);
    }

    public static void createObject(OBJReference obj) {
        obj = new OBJReference(); 
        obj.setAge(13);
    }

    public static OBJReference createandReturn(OBJReference obj) {
        obj = new OBJReference(); 
        obj.setAge(13);
        return obj;
    }

    public static void modifyPrimative(int num) {
        num = 5;
    }

    public static int returnNewPrimative(int num) {
        num = 5;
        return num;
    }

    public static void main(String[] args) {
        OBJReference obj2 = new OBJReference();
        System.out.println("init value " + obj2.getAge()); 
        modifyObject(obj2); 
        System.out.println("after modify object " + obj2.getAge()); 
       
        createObject(obj2); 
        System.out.println("after create object " + obj2.getAge());

        createandReturn(obj2); 
        System.out.println("after create and has return NO ASSIGNMENT " + obj2.getAge());

        obj2 = createandReturn(obj2); 
        System.out.println("after create and return WITH ASSIGNMENT " + obj2.getAge());

        int abc = 6;
        modifyPrimative(abc); 
        System.out.println("after primative NO RETURN NO ASSIGNMENT " + abc); 

        returnNewPrimative(abc); 
        System.out.println("after return NO ASSIGNMENT primative " + abc); 
        
        abc = returnNewPrimative(abc); 
        System.out.println("return new primative " + abc); 

        
    }

}