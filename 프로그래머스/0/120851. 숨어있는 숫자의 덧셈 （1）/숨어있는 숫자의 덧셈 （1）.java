class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String nums = my_string.replaceAll("[^0-9]","");
        
        for(int i = 0; i < nums.length(); i++){
            int digit = nums.charAt(i)-'0';
            answer+=digit;
        }
                                
        
        return answer;
    }
}