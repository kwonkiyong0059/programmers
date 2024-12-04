class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] point = new int[201];
        
        for(int[] line:lines){
            int start = line[0]+100;
            int end = line[1]+100;
            
            for(int i=start; i<end; i++){
                point[i] +=1;
            }
        }
        
        for(int p : point){
            if(p>1) answer++;
        }
        
        
        return answer;
    }
}