public class StrassenMatMul {

    /**
     * Viết chương trình nhân ma trận Strassen cho các ma trận vuông cỡ n x n
     * Trả về ma trận kết quả
     * @param n     cỡ của ma trận (n chẵn)
     * @param a     ma trận a
     * @param b     ma trận b
     */
    public void strassenMatMul(int n, int[][] a, int[][] b) {
        // TODO
    }

    private int[][] strassen(int[][] A, int[][] B) {
        // TODO
    }

    private int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }

    private int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];

        return C;
    }

    private void split(int[][] P, int[][] C, int iB, int jB) {
        for (int i = 0; i < C.length; i++)
            for (int j = 0; j < C.length; j++)
                C[i][j] = P[i + iB][j + jB];
    }

    private void join(int[][] C, int[][] P, int iB, int jB) {
        for (int i = 0; i < C.length; i++)
            for (int j = 0; j < C.length; j++)
                P[i + iB][j + jB] = C[i][j];
    }
}