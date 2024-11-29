import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = Arrays.copyOf(numlist, numlist.length);
        
        for(int i=0; i<answer.length -1; i++){
            for(int j=0; j<answer.length -1 -i; j++){
                int A = Math.abs(answer[j]-n);
                int B = Math.abs(answer[j+1]-n);
                
                if(A>B){
                    swap(answer, j, j+1);
                } else if(A==B && answer[j]<answer[j+1]){
                    swap(answer,j, j+1);
                }        
            }
        }
        
        return answer;
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}