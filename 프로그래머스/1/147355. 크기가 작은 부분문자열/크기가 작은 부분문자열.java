class Solution {
    public int solution(String t, String p) {
        int len = t.length() - p.length() + 1;
        int answer = 0;
        
        for(int i=0; i<len; i++){
            String temp = t.substring(i, i+p.length());
            
            if(Long.parseLong(temp) <= Long.parseLong(p)){
                answer++;
            }
        }
        
        return answer;
    }
}