class Solution {
    public int solution(int[][] board) {
        int n = board.length;

        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int d = 0; d < 8; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                            if (board[nx][ny] == 0) {
                                board[nx][ny] = -1;
                            }
                        }
                    }
                }
            }
        }

        
        int safeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    safeCount++;
                }
            }
        }

        return safeCount;
    }
}
