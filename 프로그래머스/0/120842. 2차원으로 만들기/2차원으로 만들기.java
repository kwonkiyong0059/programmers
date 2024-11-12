class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int x = 0;
        for(int i = 0; i<num_list.length; i++){
            answer[x][i%n] = num_list[i];
            if((i+1)%n==0){
                x++;
            }
        }
        
        return answer;
    }
}