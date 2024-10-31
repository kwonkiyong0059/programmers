class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int x = 0;
        for(int i = n; i<num_list.length;i++){
            answer[x] = num_list[i];
            x++;
        }
        
        
        for(int i = 0; i<n; i++){
            answer[x] = num_list[i];
            x++;
        }
        
        return answer;
    }
}