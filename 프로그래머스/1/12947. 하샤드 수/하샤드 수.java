class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int y = x;
        
        int sum = 0;
        while(y>0){
            sum += y%10;
            y/=10;
        }
        
        
        return x%sum==0;
    }
}