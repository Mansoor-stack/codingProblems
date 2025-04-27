//https://leetcode.com/problems/valid-anagram/description/

import java.util.*;
public class ValidAnagram242 {


    public static void main(String[] aStrings){
        String s = "racecar";
        String t = "carrace";

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            // System.out.println("Map 1 values"+map1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);    
            // System.out.println(map2);
        }
        System.out.println("value of map 1"+map1);
        System.out.println("value of map 2"+map2);

        if (map1.equals(map2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }
}
    
    

