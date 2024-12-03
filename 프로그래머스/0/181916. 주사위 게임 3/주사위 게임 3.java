import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7]; 
        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;

        if (Arrays.stream(count).max().getAsInt() == 4) {
            return 1111 * a;
        }

        if (Arrays.stream(count).max().getAsInt() == 3) {
            int p = 0, q = 0;
            for (int i = 1; i <= 6; i++) {
                if (count[i] == 3) p = i;
                if (count[i] == 1) q = i;
            }
            return (int) Math.pow(10 * p + q, 2);
        }

        if (Arrays.stream(count).max().getAsInt() == 2) {
            long distinctCount = Arrays.stream(count).filter(x -> x == 2).count();
            if (distinctCount == 2) {
                int p = 0, q = 0;
                for (int i = 1; i <= 6; i++) {
                    if (count[i] == 2) {
                        if (p == 0) p = i;
                        else q = i;
                    }
                }
                return (p + q) * Math.abs(p - q);
            } else {
                int p = 0, q = 0, r = 0;
                for (int i = 1; i <= 6; i++) {
                    if (count[i] == 2) p = i;
                    if (count[i] == 1) {
                        if (q == 0) q = i;
                        else r = i;
                    }
                }
                return q * r;
            }
        }

        for (int i = 1; i <= 6; i++) {
            if (count[i] > 0) return i; 
        }

        return 0; 
    }
}
