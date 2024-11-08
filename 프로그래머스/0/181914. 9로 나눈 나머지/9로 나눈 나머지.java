import java.util.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(int i =0; i<number.length(); i++){
            answer += number.charAt(i) - '0';
            //char 타입은 아스키 코드값을 사용하여 문자를 저장합니다.
            //아스키 코드값은 각 문자에 대해 고유한 숫자 값을 가지고 있습니다.
            //문자 '0'의 아스키 코드값은 48이고 문자 '1'의 아스키 코드값은 49입니다.
            //만약 문자 '1'를 숫자로 변환하고 싶다면, 그 아스키 코드값인 49에서 문자 '0'의 아스키 코드값인 48을 빼면 됩니다.
        }
        
        answer %=9;
        
        return answer;
        
    }
}

