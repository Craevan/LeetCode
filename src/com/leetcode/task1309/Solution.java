package com.leetcode.task1309;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<String, Character> characterMap = new HashMap<>();

    public String freqAlphabets(String s) {
        fillMap(characterMap);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length()) {
                if (s.charAt(i + 2) == '#') {
                    sb.append(characterMap.get(s.substring(i, i + 3)));
                    i += 2;
                    continue;
                }
            }
            sb.append(characterMap.get(s.substring(i, i + 1)));
        }
        return sb.toString();
    }

    private void fillMap(Map<String, Character> map) {
        for (int i = 97, j = 1; i < 106; i++, j++) {
            String result = String.valueOf(j);
            char ch = (char) i;
            map.put(result, ch);
        }
        for (int i = 106, j = 10; i < 123; i++, j++) {
            String result = String.valueOf(j).concat("#");
            char ch = (char) i;
            map.put(result, ch);
        }
    }
}
