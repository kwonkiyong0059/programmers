class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String x="";
        int idx = phone_number.length();
        
        x = phone_number.substring(idx-4);
        
        for(int i=0; i<idx-4;i++){
            answer += "*";
        }
        
        return answer+x;
    }
}