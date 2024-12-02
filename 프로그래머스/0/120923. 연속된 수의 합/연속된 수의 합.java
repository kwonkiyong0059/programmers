class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int x = (total - (num * (num - 1) / 2)) / num;
        
        for(int i=0; i<=num-1; i++){
            answer[i] = x+i;
        }
        
        return answer;
    }
}