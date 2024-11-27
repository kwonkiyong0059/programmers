class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0, 0};
        int a = (board[0]-1)/2;
        int b = (board[1]-1)/2;
        
        for(String input: keyinput){
            switch(input){
                case "up":
                    answer[1]++;
                    if(answer[1]>b){
                        answer[1]=b;
                    }
                    break;
                case "down":
                    answer[1]--;
                    if(answer[1]<(-b)){
                        answer[1]=(-b);
                    }
                    break;
                case "right":
                    answer[0]++;
                    if(answer[0]>a){
                        answer[0]=a;
                    }
                    break;
                case "left":
                    answer[0]--;
                    if(answer[0]<(-a)){
                        answer[0]=(-a);
                    }
                    break;
            }
        }
        
        return answer;
    }
}