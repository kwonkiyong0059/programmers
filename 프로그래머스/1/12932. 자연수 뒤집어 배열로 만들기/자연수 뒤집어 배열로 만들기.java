class Solution {
    public int[] solution(long n) {
        String a = n + "";
        int[] answer = new int[a.length()];
        
        int x=0;
        
        while(n>0){
            answer[x]=(int)(n%10);
            n/=10;
            x++;
        }
        
        
        
        return answer;
    }
}