class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
     
        for(int i = 0; i<rsp.length(); i++){
            char num = rsp.charAt(i);
            
            if(num=='2'){
                answer.append('0');
            } else if(num=='0'){
                answer.append('5');
            } else if(num=='5'){
                answer.append('2');
            }
        }
        return answer.toString();
    }
}