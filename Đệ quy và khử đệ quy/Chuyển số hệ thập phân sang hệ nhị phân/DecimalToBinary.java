public class DecimalToBinary {

    /**
     * Chuyển một số nguyên không âm từ hệ thập phân sang hệ nhị phân (đệ quy)
     *
     * @param n là số nguyên không âm
     * @return biểu diễn nhị phân của n dưới dạng chuỗi
     */
    public String convertRecursive(int n) {
        if ( n ==0 ) return "0";
        if ( n ==1 ) return "1";
        else {
            return convertRecursive(n/2) + String.valueOf(n&2);
        }
        
    }

    /**
     * Chuyển một số nguyên không âm từ hệ thập phân sang hệ nhị phân (lặp)
     *
     * @param n là số nguyên không âm
     * @return biểu diễn nhị phân của n dưới dạng chuỗi
     */
    public String convertIterative(int n) {
        String nhiphan = "";
        while ( n > 0) {
            nhiphan = (n%2) + nhiphan;
            n =n/2;
        }

        return nhiphan;
    }
}