package RoughNote;

public class Coffee {

    static int age = 27;
    static String name = "Mansoor";
    int age2 = 30;
    String name2 = "Suhail";

    public static int getAge() {
        return age;
    }

    public String getName() {
        System.out.println(Coffee.age);
        Coffee obj = new Coffee();
    
        System.out.println(obj.age2);
        return name;
    }

    public static void main(String[] args) {

        // ClassA firstBday = new ClassA();
        // ClassA secondBday = new ClassA();
        // System.out.println("Age: " + ClassA.getAge());
 

        System.out.println(Coffee.getAge());
        Coffee obj = new Coffee();
        System.out.println(obj.getName());
      
    }
}
