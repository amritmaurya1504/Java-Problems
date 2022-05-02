public class SelectionSort {
    public static void selectionSort(int [] arr, int n){
        for (int i = 0; i < n - 1; i++) {
            int min = i; 
            int temp;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            if(min != i){
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 7, 8, 4 };
        int n = arr.length;
        selectionSort(arr, n);
        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }
}
