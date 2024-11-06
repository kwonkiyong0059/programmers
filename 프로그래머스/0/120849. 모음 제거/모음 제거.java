class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowel = {"a", "e", "i", "o", "u"};
        
        for (String v : vowel) {
            my_string = my_string.replace(v, "");
        }
        
        answer = my_string;
        
        return answer;
    }
}