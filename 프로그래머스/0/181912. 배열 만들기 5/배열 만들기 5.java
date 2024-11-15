import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> lists = new ArrayList<>();
        
        for(int i=0; i<intStrs.length;i++){
            int x = Integer.parseInt(intStrs[i].substring(s, s + l));
            
            if(x>k){
                lists.add(x);
            }
        }
        
        
        
        return lists.toArray();
    }
}