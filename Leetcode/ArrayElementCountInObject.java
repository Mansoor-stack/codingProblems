import java.util.*;

/* 
 * Given a input array 
 * 
*/


public class ArrayElementCountInObject {

    public  Map<Integer, Integer> duplicateElementCount(int nums[]) {
        Map<Integer, Integer> mapObj = new HashMap<Integer, Integer>();

        for (int i : nums) {
            // int count = 0;
            // if (mapObj.containsKey(i)) {

            //     count = mapObj.get(i);
            //     count = count + 1;
            //     mapObj.put(i, count);

            // } else {
            //     mapObj.put(i, (count+1));
            // }
           mapObj.put(i, mapObj.getOrDefault(i,0)+1);

        }
        return mapObj;
    }

    public static void main(String[] args) {

        ArrayElementCountInObject obj = new ArrayElementCountInObject();
        int[] array = { 1, 2, 3, 4, 3, 5, 4, 1, 1, 4, 3, 5 };
        System.out.println(obj.duplicateElementCount(array));

    }

}
