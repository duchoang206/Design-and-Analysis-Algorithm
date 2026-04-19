import java.util.Arrays;

class KruskalMST {

    /**
     * Tìm cây bao trùm nhỏ nhất bằng thuật toán Kruskal
     *
     * @param n     số đỉnh (0 tới n-1)
     * @param edges danh sách cạnh, mỗi cạnh dạng [u, v, w]
     * @return danh sách cạnh của MST (mảng kích thước n - 1, mỗi phần tử [u, v, w])
     */
    public int[][] kruskal(int n, int[][] edges) {
        Arrays.sort(edges, (a, b) -> a[2] - b[2]);
        // TODO
        return new int[n - 1][3];
    }
}