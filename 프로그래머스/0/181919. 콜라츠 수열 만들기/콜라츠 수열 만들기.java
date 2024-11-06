import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n>1){
            if(n%2==0){
                n=n/2;
            } else if(n%2==1){
                n= 3*n+1; 
            }
            answer.add(n);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}