class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean capitalize = true;  

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  
            if (capitalize && Character.isLetter(c)) { 
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(Character.toLowerCase(c));
            }
            capitalize = (c == ' ');
        }

        return answer.toString();
    }
}
