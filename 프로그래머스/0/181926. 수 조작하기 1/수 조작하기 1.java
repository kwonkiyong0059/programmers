class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(int i =0; i< control.length(); i++){
            char command = control.charAt(i);
            
            switch(command){
                case 'w':
                answer +=1;
                break;
                
                case 's':
                answer -=1;
                break;
                
                case 'd':
                answer +=10;
                break;
                
                case 'a':
                answer -=10;
                break;
            }
        }
        
        return answer;
    }
}