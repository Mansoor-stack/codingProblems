

import java.util.*;

public class FirstNonRepeatingElementApproach2 {

    public static void firstNonRepeatingElement(List<Integer> nums) {


        boolean isNonRepeatingElementPresent = false;

        LinkedHashMap<Integer, Integer> map1 = new LinkedHashMap<Integer, Integer>();

        for (int item : nums) {
            map1.put(item, map1.getOrDefault(item, 0) + 1);

        }


        for(int item: map1.keySet()){

            if(map1.get(item)==1){
                isNonRepeatingElementPresent = true;
                System.out.println("The first non repeating element is "+item+" and index is "+nums.indexOf(item));
                break;
               
            }
        }
       

    }

    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 1, 4, 4));

        FirstNonRepeatingElementApproach2.firstNonRepeatingElement(nums);

    }

}
