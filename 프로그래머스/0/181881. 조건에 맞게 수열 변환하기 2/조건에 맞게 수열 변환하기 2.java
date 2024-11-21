class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true){
            boolean isSame =true;
            int[] previous = arr.clone();
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2; 
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1; 
                }
            }
            
            for(int i=0; i<arr.length;i++){
                if(previous[i] != arr[i]){
                    isSame = false;
                    break;
                }
            }
            
            answer++;
            
            if(isSame){
                break;
            }
            
        }
        
        return answer-1;
    }
}