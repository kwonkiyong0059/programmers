class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i=1; i<=count; i++){
            answer += (i*price);
        }
        
        answer = money-answer;

        return answer>0 ? 0 : Math.abs(answer);
    }
}