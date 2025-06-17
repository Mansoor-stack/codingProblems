

import java.util.*;

public class TopKFrequentElements {

    public List<Integer> frequentElements(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int items : nums) {
            map.put(items, map.getOrDefault(items, 0) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() >= k) {
                list.add(entry.getKey());

            }

        }

        if (list.isEmpty()) {
            System.out.println("There is no elements found with frequency" + k);
        }

        return list;

    }

    public static void main(String[] args) {

        int[] nums = { 1, 1, 1, 2, 2, 3, 3, 4 };
        int k = 2;
        TopKFrequentElements obj = new TopKFrequentElements();
        System.out.println(obj.frequentElements(nums, k));

    }

}
