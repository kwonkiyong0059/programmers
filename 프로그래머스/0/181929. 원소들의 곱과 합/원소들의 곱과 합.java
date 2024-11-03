class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int multi = 1;
        int add = 0;
        for(int i : num_list){
            multi *= i;
            add += i;
        }
        
        int add2 = add*add;
        if(multi<add2){
            answer = 1;
        } else if(multi>add2){
            answer = 0;    
        }
        
        return answer;
    }
}