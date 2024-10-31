class Solution {
    public String[] solution(String[] names) {
        int index = names.length;
        
        String[] answer = new String[index%5==0?index/5:index/5+1];
        
        int X = 0;
        for(int i =0; i<index;i++){
            if(i%5 == 0){
                answer[X] = names[i];
                X++;
            }
        }

        return answer;
    }
}