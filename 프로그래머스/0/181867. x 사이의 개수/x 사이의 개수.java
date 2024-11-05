class Solution {
    public int[] solution(String myString) {
        
        int len = 0;
        for(int i =0; i<myString.length(); i++){
            if(myString.charAt(i)=='x'){
                len++;
            }
        }
        
        int partLength = 0;
        int index = 0;
        
        int[] answer = new int[len + 1];  
        for(int i = 0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                answer[index] = partLength;
                index++;
                partLength = 0;
            } else {
                partLength++;
            }
            
        }
        
        answer[index] = partLength;
        
        return answer;
    }
}