// package com.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while ( j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1,5,3,7,8,4 };
        int n = arr.length;
        insertionSort(arr,n);
        for (int i : arr) {
            System.out.printf(i + " ");
        }
    }
}
