class Solution {
    public int solution(int n) {
        int answer = n;
        
        int originCnt = Integer.bitCount(n);
        
        while(true){
            int sameOneCnt = Integer.bitCount(++answer);
            if(originCnt == sameOneCnt){
                break;
            }
        }
        
        
        return answer;
    }
}

// Integer.bitCount(n): n의 이진수에서 '1'의 개수