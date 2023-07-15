public class J0002ArraySorting {
    static void sort() {
        int temp = 0;
        int arr[] = { 6, 4, 8, 2, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        sort();
    }
}
