class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<queries.length; j++){
                int s = queries[j][0];
                int e = queries[j][1];
                
                if(s<=i&& i<=e){
                    arr[i]++;
                }
            }
        }
        answer = arr;
        
        return answer;
    }
}