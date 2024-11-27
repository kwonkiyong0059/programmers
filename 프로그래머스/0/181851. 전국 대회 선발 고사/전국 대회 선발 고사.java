import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        List<int[]> possibleStudents = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                possibleStudents.add(new int[] {rank[i], i});
            }
        }
        
        possibleStudents.sort((a, b) -> a[0]-b[0]);
        
        int a = possibleStudents.get(0)[1];
        int b = possibleStudents.get(1)[1];
        int c = possibleStudents.get(2)[1];
        
        answer = 10000 * a + 100 * b + c;
        
        return answer;
    }
}