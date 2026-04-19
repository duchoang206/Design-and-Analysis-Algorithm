import java.util.Arrays;

class MergeSort {
    private int[] array;   // Mảng cần sắp xếp

    /**
     * Hàm dựng để khởi tạo
     * @param array mảng đầu vào cần sắp xếp
     */
    public MergeSort(int[] array) {
        this.array = array;
    }

    /**
     * Trộn (merge) hai nửa đã được sắp xếp của mảng.
     *
     * Quy ước:
     * - Đoạn [left, mid] đã được sắp xếp.
     * - Đoạn [mid+1, right] đã được sắp xếp.
     *
     * Yêu cầu sau khi trộn:
     * - Đoạn [left, right] được sắp xếp hoàn chỉnh.
     *
     * @param left chỉ số bắt đầu
     * @param mid chỉ số giữa
     * @param right chỉ số kết thúc
     */
    public void merge(int left, int mid, int right) {
        // TODO
    }

    /**
     * Thực hiện sắp xếp mảng theo thứ tự tăng dần bằng thuật toán sắp xếp trộn
     *
     * @param left chỉ số đầu
     * @param right chỉ số cuối
     */
    public void sort(int left, int right) {
        // TODO
    }

    /**
     * Trả về mảng tại một thời điểm
     *
     * @return mảng array hiện tại
     */
    public int[] getCurrentArray() {
        return array;
    }

    @Override
    public String toString() {
        return "MergeSort Result:\n" +
               "Array: " + Arrays.toString(array);
    }
}