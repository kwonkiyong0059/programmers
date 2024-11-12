class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        StringBuilder str = new StringBuilder();
        for(int x=i; x<=j; x++){
            str.append(x);
        }
        
        String kStr = String.valueOf(k);
        
        int index = str.indexOf(kStr);
        while (index != -1) {
            answer++; 
            index = str.indexOf(kStr, index + 1); 
        }

        return answer;
    }
}