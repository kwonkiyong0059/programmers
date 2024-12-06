import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length==1){
            return new int[]{-1};
        }
        
        int min = Arrays.stream(arr).min().getAsInt();
        
        List<Integer> answer = new ArrayList<>();
        for(int num : arr){
            if(num != min){
                answer.add(num);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}