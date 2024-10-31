import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int arrsize =0;
        for(int i: arr){
            arrsize += i;
        }
        
        int index = 0;
        int[] answer =new int[arrsize];
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[i]; j++){
                answer[index] = arr[i];
                index++;
            }
        }
        
        
         return answer;
    }
}