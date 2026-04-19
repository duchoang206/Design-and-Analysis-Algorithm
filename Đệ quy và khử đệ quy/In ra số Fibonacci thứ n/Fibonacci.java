public class Fibonacci {

    /**
     * Tính số Fibonacci thứ n bằng phương pháp đệ quy.
     *
     * @param n số tự nhiên chỉ số của số Fibonacci cần tính
     * @return giá trị Fibonacci thứ n
     */
    public int fibonacciRecursive(int n) {
        if ( n ==0) return 0;
        if ( n ==1) return 1;
        else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
        
    }

    /**
     * Tính số Fibonacci thứ n bằng phương pháp không đệ quy.
     *
     * @param n số tự nhiên chỉ số của số Fibonacci cần tính
     * @return giá trị Fibonacci thứ n
     */
    public int fibonacciIterative(int n) {
        if ( n ==0 )return 0;
        if ( n ==1 ) return 1;
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        for ( int i = 2; i < n ; i++) {
            fn = f0 + f1;
            f0 =f1;
            f1 =fn;
        }
        return fn;
    }
}