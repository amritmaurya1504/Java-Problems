public class BubbleSort {
    public static void bubbleSort(int[] arr, int n){
        int temp;
        for (int i = 0; i < n -1 ; i++) {
            for (int j = 0; j < n - i - 1 ; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1,5,3,7,8,4 };
        int n = arr.length;
        bubbleSort(arr,n);
        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }
}
