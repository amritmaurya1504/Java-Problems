public class Lecture_4 {
    public static void reverse(int l, int r, int[] arr){
        if(l >= r){
            return;
        }else{
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            reverse(l+1, r-1, arr);
        }
    }
    
    public static void main(String[] args) {
        // REVERSE AN ARRAY USING RECURSION
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        reverse(0,n-1, arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
