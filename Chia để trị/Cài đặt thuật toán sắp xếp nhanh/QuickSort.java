import java.util.Arrays;

class QuickSort {
    private int[] array;   // Mảng cần sắp xếp

    /**
     * Hàm dựng để khởi tạo
     * @param array mảng đầu vào cần sắp xếp
     */
    public QuickSort(int[] array) {
        this.array = array;
    }

    /**
     * Hoán đổi hai phần tử trong mảng
     * @param i chỉ số phần tử thứ nhất
     * @param j chỉ số phần tử thứ hai
     */
    protected void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Phân hoạch mảng theo pivot cố định.
     *
     * Quy ước:
     * - Pivot luôn chọn là phần tử cuối: array[high]
     *
     * Yêu cầu sau khi phân hoạch:
     * - Pivot phải nằm ở đúng vị trí trong mảng đã phân hoạch.
     * - Các phần tử nhỏ hơn pivot nằm bên trái pivot.
     * - Các phần tử lớn hơn pivot nằm bên phải pivot.
     * - Không yêu cầu sắp xếp hoàn chỉnh hai phía.
     *
     * @param low chỉ số bắt đầu của đoạn phân hoạch
     * @param high chỉ số kết thúc của đoạn phân hoạch
     * @return chỉ số vị trí cuối cùng của pivot
     */
    public int partition(int low, int high) {
        int pivot = array[high];
        // TODO
        return -1;
    }

    /**
     * Thực hiện sắp xếp mảng theo thứ tự tăng dần bằng thuật toán sắp xếp nhanh
     * 
     * @param low chỉ số đầu
     * @param high chỉ số cuối
     */
    public void sort(int low, int high) {
        // TODO
    }
    
    /**
     * Trả về mảng tại một thời điểm
     * 
     * @param mảng array 
     */
    public int[] getCurrentArray(){
        return array;
    }

    @Override
    public String toString() {
        return "QuickSort Result:\n" +
               "Array: " + Arrays.toString(array);
    }
}