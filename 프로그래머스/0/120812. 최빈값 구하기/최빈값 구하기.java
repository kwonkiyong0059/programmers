import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> mode = new HashMap<>();
        
        for (int num : array) {
            mode.put(num, mode.getOrDefault(num, 0) + 1);
        }

        int m = -1; 
        int maxFrequency = 0;
        boolean isDuplicate = false;

        for (Map.Entry<Integer, Integer> entry : mode.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                m = entry.getKey();
                isDuplicate = false; 
            } else if (entry.getValue() == maxFrequency) {
                isDuplicate = true; 
            }
        }

       
        return isDuplicate ? -1 : m;
    }
}
