class Solution {
    public String solution(String s) {
        String answer = "";
        int among = s.length()/2;
        
        if(s.length()%2==0){
            answer = s.substring(among-1, among+1);
        }else{
            answer = s.substring(among, among+1);
        }
        
        
        return answer;
    }
}