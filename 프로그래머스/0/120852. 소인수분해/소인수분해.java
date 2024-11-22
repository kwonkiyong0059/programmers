import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> factors = new LinkedHashSet<>();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        int[] result = new int[factors.size()];
        int index = 0;
        for (int factor : factors) {
            result[index++] = factor;
        }

        return result;
    }
}