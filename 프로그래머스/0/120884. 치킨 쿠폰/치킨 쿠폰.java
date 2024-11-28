class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        for(int i=1; i<=chicken; i++){
            if((i+answer)%10==0){
                answer++;
            }
        }
        return answer;
    }
}