public class QuickSort {
    public static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pivot = partion(arr, l, h);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, h);
        }
    }

    public static int partion(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, j, l);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 4,8,1,2,7,3 };
        int h = arr.length - 1;
        int l = 0;
        quickSort(arr, l, h);
        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }
}
