class Solution {
    public int[] solution(String s) {
        int count = 0;  
        int zeroCount = 0;  

        while (!s.equals("1")) {
            int lengthBefore = s.length();
            s = s.replace("0", ""); 
            int lengthAfter = s.length();
            zeroCount += (lengthBefore - lengthAfter); 

            s = Integer.toBinaryString(lengthAfter); 
            count++; 
        }

        return new int[]{count, zeroCount}; 
    }
}
