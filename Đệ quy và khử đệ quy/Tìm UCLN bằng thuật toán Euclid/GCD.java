public class GCD {

    /**
     * Tìm UCLN của 2 số bằng thuật toán Euclid (đệ quy)
     *
     * @param a, b là hai số tự nhiên
     * @return UCLN của a và b
     */
    public int findGcdRecursive(int a, int b) {
        // TODO
        if ( b==0) return a;
        else {
           return findGcdRecursive(a, a%b);
        }
    }

    /**
     * Tìm UCLN của 2 số bằng thuật toán Euclid (lặp)
     *
     * @param a, b là hai số tự nhiên
     * @return UCLN của a và b
     */
    public int findGcdIterative(int a, int b) {
        if ( b==0) return a;
        else {
            while ( b!=0 ) {
                int temp =b;
                b = a%b;
                a =temp;
            }
            return a;
        }
    }
}