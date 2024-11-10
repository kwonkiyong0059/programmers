import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        
        List<String> filter = new ArrayList<>();
        for(String part : parts){
            if(!part.isEmpty()){
                filter.add(part);
            }
        }
        
        String[] answer = filter.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}