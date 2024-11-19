class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
//         for(int num : array){
//             String str = Integer.toString(num);
            
//             for(char ch: str.toCharArray()){
//                 if(ch == '7'){
//                     answer++;
//                 }
//             }
//         }
        for(int num : array){
        String str = Integer.toString(num);
        
        int originalLength = str.length();
        int newLength = str.replace("7", "").length();
        
        answer += originalLength - newLength;
        }
        
        return answer;
    }
}