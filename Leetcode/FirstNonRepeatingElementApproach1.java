

import java.util.*;

public class FirstNonRepeatingElementApproach1 {

    public boolean nonrepeatingelementIndex(LinkedList<Integer> nums) {
        boolean isNonRepeatingElementPresent = false;

        for (int i = 0; i < nums.size(); i++) {
            int count = 1;
            for (int j = 0; j < nums.size(); j++) {

                if (nums.get(i) == nums.get(j)) {

                    count++;

                }
            }
            if (count == 2) {
                isNonRepeatingElementPresent = true;
                System.out.println("The first non repeating integer is " + nums.get(i) + " and index number is " + i);
                break;
            }

        }
        return isNonRepeatingElementPresent;
    }

    public static void main(String[] args) {

        // int[] arr = { 1, 2, 3, 2, 3, 4, 5, 6, 1, 4, 4 };
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 2, 3, 4, 5, 6, 1, 4, 4));
        FirstNonRepeatingElementApproach1 obj = new FirstNonRepeatingElementApproach1();
       System.out.println(obj.nonrepeatingelementIndex(ll)); 

    }

}
