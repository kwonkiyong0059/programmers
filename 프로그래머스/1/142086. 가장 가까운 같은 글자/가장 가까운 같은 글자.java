import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int[] result = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (lastSeen.containsKey(currentChar)) {
                result[i] = i - lastSeen.get(currentChar);
            } else {
                result[i] = -1;
            }
            lastSeen.put(currentChar, i);
        }
        
        return result;
    }
}
