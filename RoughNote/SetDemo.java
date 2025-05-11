package RoughNote;

import java.util.*;
public class SetDemo {

    public static void main(String[] args){

        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.remove(4);
        System.out.println(numbers);


        Set<String> numbers2 = new LinkedHashSet<String>();
        numbers2.add("Mansoor");
        numbers2.add("Ahmed");
        numbers2.add("Coffee");
        System.out.println(numbers2);


    }
    
}
