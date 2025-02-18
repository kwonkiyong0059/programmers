class Solution {
    public int solution(int n) {
        int answer = 0;
   for (int i = 1; i <= n; i += 2) 
       if (n % i == 0) 
           answer++;

   return answer;
    }
}

// 홀수 약수의 개수 = 연속된 자연수로 표현하는 방법의 개수