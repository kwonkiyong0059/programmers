class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int sum = 0;
        
        for(int num : sides){
            sum += num;
            max = Math.max(max, num);
        }
        
        int x = sum -max;
        
        answer = max< x ? 1:2;
        
        return answer;
    }
}