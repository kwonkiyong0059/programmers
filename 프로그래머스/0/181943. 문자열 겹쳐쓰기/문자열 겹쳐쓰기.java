class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder(my_string);
        int x = overwrite_string.length();
        
        answer.replace(s, s+x, overwrite_string);
        
        return answer.toString();
    }
}