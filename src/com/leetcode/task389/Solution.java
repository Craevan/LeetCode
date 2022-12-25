package com.leetcode.task389;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        fillMap(map1);
        Map<Character, Integer> map2 = new HashMap<>(map1);
        
        for (int i = 0; i < s.length(); i++) {
            int count = map1.get(s.charAt(i));
            map1.put(s.charAt(i), ++count);
            int count2 = map2.get(t.charAt(i));
            map2.put(t.charAt(i), ++count2);
        }
        int lastCount = map2.get(t.charAt(t.length() - 1));
        map2.put(t.charAt(t.length() - 1), ++lastCount);
        Character result = null;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            int valueInMap2 = map2.get(key);
            if (value != valueInMap2) {
                result = key;
                break;
            }
        }
        return result;
    }
    
    private void fillMap(Map<Character, Integer> map) {
        for (int i = 97; i < 123; i++) {
            map.put((char) i, 0);
        }
    }
}
