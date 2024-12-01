import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        for(int i=0; i<query.length; i++){
            if(i%2==0){
                arr=Arrays.copyOfRange(arr, 0, query[i]+1);
            } else{
                arr=Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        
        
        return arr;
    }
}

//Arrays.copyOfRang(복사할 원본 배열, 복사를 시작할 인덱스, 복사를 끝낼 인덱스)
