class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder change = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            
            if(Character.isUpperCase(c)){
                change.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)){
                change.append(Character.toUpperCase(c));
            } else{
                change.append(c);
            }
        }
        
        answer = change.toString();
        
        return answer;
    }
}