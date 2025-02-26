import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 같은 문자면 제거
            } else {
                stack.push(c); // 다른 문자면 추가
            }
        }
        
        return stack.isEmpty() ? 1 : 0; // 스택이 비어있으면 1 아니면 0
    }
}