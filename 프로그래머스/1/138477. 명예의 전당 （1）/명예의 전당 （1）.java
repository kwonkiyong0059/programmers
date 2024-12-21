import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
        List<Integer> dailyMinScores = new ArrayList<>();

        for (int s : score) {
            hallOfFame.add(s);

            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }

            dailyMinScores.add(hallOfFame.peek());
        }

        return dailyMinScores.stream().mapToInt(Integer::intValue).toArray();
    }
}
