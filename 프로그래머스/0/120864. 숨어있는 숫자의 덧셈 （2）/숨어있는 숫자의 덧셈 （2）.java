class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String replaced = my_string.replaceAll("[^0-9]", " ");
        
        String[] numbers = replaced.trim().split("\\s+");
        
        for(String num : numbers){
            if(!num.isEmpty()){
                answer += Integer.parseInt(num);
            }
        }
        
        
        return answer;
    }
}