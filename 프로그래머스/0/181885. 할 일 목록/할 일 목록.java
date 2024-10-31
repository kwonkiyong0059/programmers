class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int F = 0;
        for(int i = 0; i<finished.length; i++){
            if(!finished[i]){
                F++;
            }
        }
        String[] answer = new String[F];
        int X = 0;
        for(int i = 0; i<finished.length; i++){
            if(!finished[i]){
                answer[X] = todo_list[i];
                X++;
            }
        }
        
        
        return answer;
    }
}