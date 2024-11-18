import java.util.*;

class Solution {
    public String solution(String s) {
        int[] alp = new int[26];
        
        for(char c : s.toCharArray()){
            alp[c-'a']++;
        }
        
        List<Character> unique = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(alp[c-'a']==1){
                unique.add(c);
            }
        }
        
        Collections.sort(unique);
        
        StringBuilder answer = new StringBuilder();
        for(char c: unique){
            answer.append(c);
        }
        
        return answer.toString();
    }
}