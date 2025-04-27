package RoughNote;
public class ClassA{

    static int age = 0;
    static String name = "John Doe";

    ClassA(){
        System.out.println("Constructor called");
        age++;
        System.out.println("Age: " + age);

    }
   
    public static int getAge(){
        return age;

    }
}