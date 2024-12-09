class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                answer.append(c);
            }else if(Character.isUpperCase(c)){
                char x = (char)((c-'A'+n) % 26 + 'A');
                answer.append(x);
            }else if(Character.isLowerCase(c)){
                char x = (char)((c-'a'+n) % 26 + 'a');
                answer.append(x);
            }
        }
        
        return answer.toString();
    }
}
