class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        
        for(int i = num_list.length -1; i>=0; i--){
            if(i%2 ==0){
                odd += num_list[i];
            } else if(i%2 ==1){
                even += num_list[i];
            }
        }
        
        answer = odd >= even? odd : even;
        
        
        return answer;
    }
}