class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch=='p'){
                p++;
            }else if(ch=='y'){
                y++;
            }
        }
        
        if(p==y){
            answer=true;
        }else{
            answer=false;
        }

        return answer;
    }
}