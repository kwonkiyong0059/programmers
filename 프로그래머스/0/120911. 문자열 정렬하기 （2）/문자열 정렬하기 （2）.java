import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        
        String lower = my_string.toLowerCase();
        
        char[] strList = lower.toCharArray();
        
        Arrays.sort(strList);
        
        return new String(strList);
    }
}