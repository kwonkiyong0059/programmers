import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        for(int num : numbers){
            list.add(num);
        }
        
        switch(direction){
            case "right" :
                Collections.rotate(list, 1);
                break;
            case "left" :
                Collections.rotate(list, -1);
                break;
        }
        
        int[] answer = new int[numbers.length];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}