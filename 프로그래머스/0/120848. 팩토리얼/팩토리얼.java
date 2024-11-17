class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int x = 1;
        for(int i =1; i<=10; i++){
           x *= i;
            if(x==n){
                answer = i;
                break;
            } else if(x>n){
                answer = i-1;
                break;
            }
        }
        
        return answer;
    }
}