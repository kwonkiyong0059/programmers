class Solution {
    public int solution(int num) {
//num을 long타입 변환해야 한다.
        
        long numLong = (long) num;
        
        int answer = 0;
        
        while (numLong != 1) {
            if (numLong % 2 == 0) {
                numLong /= 2; 
            } else {
                numLong = numLong * 3 + 1;
            }
            answer++;

            if (answer >= 500) {
                return -1;
            }
        }

        return answer; 
    }
}
