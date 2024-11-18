class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(n-array[0]);

        for(int i=1; i<array.length;i++){
            int diff = Math.abs(n-array[i]);
            
            if(diff<min || (diff == min && array[i]<answer)){
                answer = array[i];
                min = diff;
            }
            
        }
        
        return answer;
    }
}