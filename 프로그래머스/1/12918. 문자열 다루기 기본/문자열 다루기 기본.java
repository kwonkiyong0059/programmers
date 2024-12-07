class Solution {
    public boolean solution(String s) {
        
        if(s.length() ==4 || s.length() ==6){
        String x = s.replaceAll("[^0-9]", "");
            return s.equals(x);
        }else{
            return false;
        }
    }
}