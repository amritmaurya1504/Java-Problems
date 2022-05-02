import java.util.ArrayList;

public class Lecture_7 {
    public static void printF(int ind, ArrayList<Integer> ds,int[] arr, int s, int sum, int n){
        if(ind == n){
            if(s == sum){
                for (int e : ds) {
                    System.out.printf(e + " ");
                }
                System.out.println();
            }
            return;
        }

        ds.add(arr[ind]);
        s += arr[ind];
        printF(ind + 1, ds, arr, s, sum, n);
        ds.remove(ds.size() - 1);
        s -= arr[ind];
        printF(ind + 1, ds, arr, s, sum, n);
    }
    public static void main(String[] args) {
        int [] arr = { 1 , 2, 1 };
        int n = 3;
        int sum = 2;
        ArrayList<Integer> ds = new ArrayList<>();
        printF(0, ds, arr, 0,sum,n);
    }
}
