class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        int index = 0; 
        for (String row : picture) {
            
            String expandedRow = "";
            for (char c : row.toCharArray()) {
                expandedRow += String.valueOf(c).repeat(k); 
            }
           
            for (int i = 0; i < k; i++) {
                answer[index++] = expandedRow; 
            }
        }

        return answer;
    }
}
