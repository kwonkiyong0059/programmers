import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i =l;i<=r;i++){
            String num = String.valueOf(i);
            boolean isValid = true;
            
            for(char ch: num.toCharArray()){
                if(ch!='0' && ch!='5'){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            return new int[] {-1};
        }
        
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}