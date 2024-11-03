class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String AB = String.valueOf(a) +String.valueOf(b);
        
        int ab = Integer.parseInt(AB);
        
        answer = ab >= 2*a*b? ab : 2*a*b;
        
        
        return answer;
    }
}