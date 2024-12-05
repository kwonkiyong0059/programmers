import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        
        for(int a:arr){
            if(a%divisor==0){
                answer.add(a);
            }
        }
        
        int[] array = answer.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(array);
        
        return array.length!=0? array: new int[]{-1};
    }
}