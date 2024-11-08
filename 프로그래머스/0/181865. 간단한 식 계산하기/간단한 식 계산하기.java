class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] parts = binomial.split(" ");
        
        int a = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int b = Integer.parseInt(parts[2]);
        
        switch (operator) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        
        return answer;
    }
}