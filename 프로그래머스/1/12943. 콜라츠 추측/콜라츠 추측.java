class Solution {
    public int solution(int num) {
        int answer = 0;
        
        long I = (long) num;

        while (I != 1) {
            if (I % 2 == 0) {
                I /= 2; 
            } else {
                I = I * 3 + 1;
            }
            answer++;

            if (answer == 500) {
                return -1;
            }
        }

        return answer; 
    }
}
