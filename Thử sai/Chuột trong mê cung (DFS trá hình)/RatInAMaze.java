import java.util.ArrayList;

public class RatInAMaze {
    private static final int[] dRow = {1, 0, 0, -1};
    private static final int[] dCol = {0, -1, 1, 0};
    private static final String[] dir = {"D", "L", "R", "U"};

    /**
     * Cho ma trận nhị phân vuông mat[][] biểu diễn mê cung. 
     * Chuột xuất phát từ (0,0) và cần đến (n-1,n-1).
     * Chuột có thể đi 4 hướng:
     * U (lên), D (xuống), L (trái), R (phải).
     * Tìm tất cả đường đi hợp lệ (không đi lại ô đã thăm).
     * Nếu có nhiều đường đi thì in theo thứ tự từ điển tăng dần.
     * Nếu không có đường đi thì in -1.
     * 1 là ô đi được, 0 là ô bị chặn.
     * @param n     chiều rộng/chiều dài của ma trận
     * @param maze  ma trận 0/1 
     */
    public void findPaths(int n, int[][] maze) {
        ArrayList<String> kq = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        if ( maze[0][0] ==1 ) {
            solve( 0,0,n,maze,visited,"", kq);
        }
        if ( kq.isEmpty()) {
            System.out.println("-1");
        } else {
            for ( String path : kq ) {
                System.out.println(path);
            }
        }
    }
    public void solve(int r , int c , int n , int[][] maze , boolean[][] visited , String path , ArrayList<String> kq ) {
        if ( r == n-1 && c == n-1) {
            kq.add(path);
        }
        visited[r][c] = true;
        for ( int i = 0; i<4 ; i++ ) {
            int nextR = r + dRow[i];
            int nextC = c + dCol[i];
        if (nextR >= 0 && nextR < n && nextC >= 0 && nextC < n 
                && maze[nextR][nextC] == 1 && !visited[nextR][nextC]) {
                
                solve(nextR, nextC, n, maze, visited, path + dir[i], kq);
            }
        }
    
    visited[r][c] = false;

                // TODO
    }
}