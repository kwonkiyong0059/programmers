import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1, end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (start == -1) {
                    start = i; 
                }
                end = i; 
            }
        }

        if (start == -1) {
            return new int[]{-1};
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
