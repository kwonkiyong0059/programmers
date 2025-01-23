class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] numbers = s.split(" ");
        int min = Integer.MAX_VALUE; //가장 높은 수를 넣어 점점 작아지게
        int max = Integer.MIN_VALUE; //가장 낮은 수를 넣어 점점 커지게
        
        for(int i=0; i<numbers.length;i++){
            int number = Integer.parseInt(numbers[i]);
        
        
            min = Math.min(min, number);
            max = Math.max(max, number);
            
        }
        
        answer = min + " " + max; //중간에 " "를 넣어 자동으로 String 타입으로 변환
        
        return answer;
    }
}