class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder str = new StringBuilder(my_string);
            
        char char1 = str.charAt(num1);
        char char2 = str.charAt(num2);
        
        str.setCharAt(num1, char2);
        str.setCharAt(num2, char1);
        
        answer = str.toString();
        
        return answer;
    }
}