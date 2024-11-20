class Solution {
    public int solution(String s) {
        int answer = 0;
        int lastNum = 0;
        String[] str = s.split("\\s+");
        
        for(String element : str){
            if(element.equals("Z")){
                answer -= lastNum;
            }else{
                lastNum = Integer.parseInt(element);
                answer += lastNum;
            }
        }
        
        return answer;
    }
}