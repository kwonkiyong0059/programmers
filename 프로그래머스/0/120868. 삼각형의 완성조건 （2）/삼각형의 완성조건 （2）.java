class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        int a = max - min + 1;
        int b = max + min - 1;
               
        
        return b - a + 1;
    }
}