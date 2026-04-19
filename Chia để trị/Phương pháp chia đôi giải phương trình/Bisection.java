public class Bisection {
    
    public static double f(double x) {
        return x * Math.cos(x) - Math.exp(-x) - x*x/8 + 2;
    }

    /**
     * Giải phương trình f(x) = 0 bằng phương pháp chia đôi.
     * 
     * Ý tưởng:
     * Giả sử hàm f(x) liên tục trên đoạn [a, b] và f(a) * f(b) < 0,
     * khi đó phương trình f(x) = 0 có ít nhất một nghiệm trong (a, b).
     *
     * Thuật toán:
     * 1. Kiểm tra điều kiện f(a) * f(b) < 0. 
     * Nếu không thỏa mãn, in ra "NO SOLUTION."
     * 2. Lặp cho đến khi |b - a| < eps:
     *      - Tính c = (a + b) / 2.
     *      - Nếu f(a) * f(c) <= 0 thì nghiệm nằm trong [a, c], đặt b = c.
     *      - Ngược lại nghiệm nằm trong [c, b], đặt a = c.
     * 3. Khi dừng, nghiệm gần đúng là (a + b) / 2.
     * Kết quả làm tròn đến chữ số thập phân thứ 6.
     *
     * @param a   đầu mút trái của khoảng
     * @param b   đầu mút phải của khoảng
     * @param eps sai số cho phép
     */
    public void solve(double a, double b, double eps) {
        // TODO
    }
}