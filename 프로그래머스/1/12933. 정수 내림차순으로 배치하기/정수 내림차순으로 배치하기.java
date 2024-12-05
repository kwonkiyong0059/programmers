import java.util.*;

class Solution {
    public long solution(long n) {
        String a = n + "";
        Integer[] nums = new Integer[a.length()];
        
        for(int i=0; i<a.length();i++){
            nums[i] = a.charAt(i) - '0';
        }
        
        Arrays.sort(nums, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int num : nums){
            sb.append(num);
        }
        
        return Long.parseLong(sb.toString());
    }
}