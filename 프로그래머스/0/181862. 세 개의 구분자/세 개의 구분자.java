import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        
        myStr = myStr.replaceAll("[abc]", " ");
        
        
        String[] list = myStr.split("\\s+");
        
        for(String i : list){
            if(!i.isEmpty()){
                answer.add(i);
            }
        }
        
        if(answer.isEmpty()){
            answer.add("EMPTY");
        }
        
        return answer.toArray(new String[0]);
    }
}