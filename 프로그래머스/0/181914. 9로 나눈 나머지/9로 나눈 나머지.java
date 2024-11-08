import java.util.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        int[] numArray = new int[number.length()];
        
        for(int i = 0; i<number.length(); i++){
            numArray[i] = Character.getNumericValue(number.charAt(i));
            answer+=numArray[i];
        }
        
        answer %= 9;
        
        return answer;
        
    }
}