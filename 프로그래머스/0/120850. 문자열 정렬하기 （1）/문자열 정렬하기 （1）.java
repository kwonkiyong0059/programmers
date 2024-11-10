import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        
        String strNum = my_string.replaceAll("[^0-9]","");
        
        int[] answer = new int[strNum.length()];
        for(int i = 0; i< strNum.length(); i++){
            answer[i] = strNum.charAt(i) -'0';
        }
        
        Arrays.sort(answer);
        
        
        return answer;
    }
}