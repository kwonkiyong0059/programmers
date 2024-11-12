import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new LinkedHashSet<>();
        for(char ch : my_string.toCharArray()){
            set.add(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        for(char ch : set){
            sb.append(ch);
        }
        return sb.toString();
    }
}