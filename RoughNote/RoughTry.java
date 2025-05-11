package RoughNote;

import java.util.*;
public class RoughTry {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 1, 4, 4 ));
       
        nums.removeIf(x->x==2);
        System.out.println(nums);

       ArrayList<Integer> removenums = new ArrayList<Integer>();
       removenums.add(1);
       removenums.add(2);
       removenums.add(3);

      // nums.removeAll(removenums);

       System.out.println(nums);

       LinkedHashSet<Integer> setnums = new LinkedHashSet<Integer>();
       setnums.addAll(nums);
       System.out.println(setnums);


    }
    
}
