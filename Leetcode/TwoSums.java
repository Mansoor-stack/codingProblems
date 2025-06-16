

import java.util.*;

public class TwoSums {

    public int[] twoSumApproach1(int[] nums, int target) {

        HashMap<Integer, Integer> diffChecker = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];
            if (diffChecker.containsKey(diff)) {
                System.out.printf("The index is %d, %d \n", diffChecker.get(diff), i);

                return new int[] { diffChecker.get(diff), i };
            } else {
                diffChecker.put(nums[i], i);
            }

        }
        return new int[] {};

    }

    public static int[] twoSumsApproach2(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], i);
            System.out.println(map);
        }

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (map.containsKey(diff) && map.get(diff) != i) {

                return new int[] { i, map.get(diff) };
            }
        }

        return new int[] {};

    }

    public static void main(String[] args) {

        int[] nums = new int[] { 3, 4, 5, 6 };
        int t = 7;
        TwoSums obj = new TwoSums();

        obj.twoSumApproach1(nums, t);
        System.out.println(Arrays.toString(TwoSums.twoSumsApproach2(nums, t)));

    }
}
