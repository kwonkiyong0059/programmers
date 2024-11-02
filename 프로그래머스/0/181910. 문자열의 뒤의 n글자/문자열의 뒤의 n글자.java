class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        int x = my_string.length();
        
        answer = my_string.substring(x-n,x);
        
        return answer;
    }
}