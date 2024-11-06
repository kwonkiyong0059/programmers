class Solution {
    public String solution(String my_string) {
        String answer = "";
        //String[] vowel = {"a", "e", "i", "o", "u"};
        
        answer= my_string.replaceAll("[aeiou]", "");
             
        return answer;
    }
}