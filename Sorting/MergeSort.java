// package com.company;

import java.util.ArrayList;

public class MergeSort {

        public static void mergeSort(int[] arr, int l, int r) {
           if(l<r){
               int mid = (l+r)/2;
               mergeSort(arr,l,mid);
               mergeSort(arr,mid+1,r);
               merge(arr,l,mid, r);
           }
        }

        public static void merge(int[] nums, int low, int mid, int high) {
           ArrayList<Integer>ar = new ArrayList<>();
           int l = low , r = mid+1;
           while (l<=mid && r<=high){
               if( nums[l]<=nums[r]){
                   ar.add(nums[l++]);
               }
               else ar.add(nums[r++]);
           }
           while (l<=mid){
               ar.add(nums[l++]);
           }
           while(r<=high){
               ar.add(nums[r++]);
           }
           int in =0;
            for (int i = low; i <=high ; i++) {
               nums[i]= ar.get(in);
               in++;

            }
            }




        public static void main(String[] args) {
            int[] arr = { 3,4,5,1,2,8,7};
            int r = arr.length - 1;
            int l = 0;
            mergeSort(arr, l, r);
            for (int i : arr) {
                System.out.printf(i + " ");
            }
        }
    }