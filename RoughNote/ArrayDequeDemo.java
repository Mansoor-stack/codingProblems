package RoughNote;

import java.util.*;

public class ArrayDequeDemo {

    public static void main(String[] args) {
        Deque<Integer> num = new ArrayDeque<>();
        num.peek();
     
        num.add(10);

        List<Integer> n = new ArrayList<>();
        n.add(2);
        System.out.println(num);
        System.out.println(n);

        num.addFirst(3);
        num.add(5);
        num.remove();
        num.push(7);
        num.pop();
        System.out.println(num);
    }

}