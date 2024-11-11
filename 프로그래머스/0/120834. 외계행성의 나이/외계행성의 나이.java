class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = Integer.toString(age);
        for(int i =0; i<temp.length(); i++){
            answer += (char) (temp.charAt(i) - '0' + 'a');
        }
        
        return answer;
    }
}