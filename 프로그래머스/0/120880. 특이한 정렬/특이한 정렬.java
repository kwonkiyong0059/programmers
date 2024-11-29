import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = Arrays.copyOf(numlist, numlist.length);
        
        for(int i=0; i<answer.length -1; i++){
            for(int j=0; j<answer.length -1; j++){
                int A = Math.abs(answer[j]-n);
                int B = Math.abs(answer[j+1]-n);
                
                if(A>B || (A==B && answer[j]<answer[j+1])){
                    int temp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = temp;
                }       
            }
        }
        
        return answer;
    }
}