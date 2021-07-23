package app.objectReference;

public class objectReferenceClass {
    int age = 18;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public static void modifyObject(objectReferenceClass obj){
        obj.setAge(12);
    }

    public static void createObject(objectReferenceClass obj){
        obj = new objectReferenceClass(); //we are creating a new object and changing the address/reference..any change from here will not impact the calling function
        obj.setAge(13);
    }

    public static objectReferenceClass createandReturn(objectReferenceClass obj){
        obj = new objectReferenceClass(); //we are creating a new object and changing the address/reference..any change from here will not impact the calling function
        obj.setAge(13);
        return obj;
    }

    public static void modifyPrimative(int num){
        num = 5; 
    }

    public static int returnNewPrimative(int num){
        num = 5; 
        return num;
    }

    public static void main(String[] args) {
        objectReferenceClass obj2 = new objectReferenceClass(); 
        System.out.println("init value " + obj2.getAge()); //returns 18, because it is placed before main function
        modifyObject(obj2); 
        System.out.println("after modify object " + obj2.getAge()); //returns 12, because you have set it to 12 
       
        createObject(obj2); //this will not change anything because the address is A2 you are changing A1
        System.out.println("after create object " + obj2.getAge()); //this will stay at 12 

        createandReturn(obj2); //since you are returning and NOT assigning this will NOT be changed 
        System.out.println("after create and has return NO ASSIGNMENT " + obj2.getAge());

        obj2 = createandReturn(obj2); //since you are returning and assigning this will be changed to 13
        System.out.println("after create and return WITH ASSIGNMENT " + obj2.getAge());

        int abc = 6; //primative 
        modifyPrimative(abc); //will not change because of value
        System.out.println("after primative NO RETURN NO ASSIGNMENT " + abc); //it will still be 6

        returnNewPrimative(abc); //this will not change either because you are not assigning it via ab = returnNewPrimative(abc);
        System.out.println("after return NO ASSIGNMENT primative " + abc); //it will be 6 
        
        abc = returnNewPrimative(abc); //now it will change because you are assigning it 
        System.out.println("return new primative " + abc); //this will be 5 





        
    }

}