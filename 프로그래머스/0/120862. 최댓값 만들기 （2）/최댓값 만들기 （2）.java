import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        int n = numbers.length;
        
        answer = Math.max(numbers[n-1]*numbers[n-2], numbers[0]*numbers[1]);
                
                
        
        return answer;
    }
}