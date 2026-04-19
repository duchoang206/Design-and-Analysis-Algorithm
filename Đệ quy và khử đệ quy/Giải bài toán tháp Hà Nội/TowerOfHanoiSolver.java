public class TowerOfHanoiSolver {

    /**
     * Thêm từ khóa 'static' để có thể gọi trực tiếp từ hàm main
     */
    public static void solve(int n, char from, char to, char aux) {
        if (n == 1) {
            // Thêm khoảng trắng quanh chữ "sang"
            System.out.println("Move disk 1 from " + from + " to " + to);
        } else {
            // Bước 1: Di chuyển n-1 đĩa từ nguồn sang trung gian
            solve(n - 1, from, aux, to);
            
            // Bước 2: Di chuyển đĩa thứ n từ nguồn sang đích
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            
            // Bước 3: Di chuyển n-1 đĩa từ trung gian sang đích
            solve(n - 1, aux, to, from);
        }
    }

    public static void main(String[] args) {
        int nDisks = 3; 
        // Gọi hàm tĩnh (static) một cách hợp lệ
        solve(nDisks, 'A', 'C', 'B'); 
    }
}