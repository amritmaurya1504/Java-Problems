import java.util.ArrayList;

public class Lecture_7b {
    public static int printF(int ind, ArrayList<Integer> ds,int[] arr, int s, int sum, int n){
        if(ind == n){
            if(s == sum){
                return 1;
            }
            else return 0;
        }
        s += arr[ind];
        int l = printF(ind + 1, ds, arr, s, sum, n);
        s -= arr[ind];
        int r = printF(ind + 1, ds, arr, s, sum, n);
        

        return l + r;
    }
    public static void main(String[] args) {
        int [] arr = { 1 , 2, 1 };
        int n = 3;
        int sum = 2;
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.println(printF(0, ds, arr, 0,sum,n));
    }
}
