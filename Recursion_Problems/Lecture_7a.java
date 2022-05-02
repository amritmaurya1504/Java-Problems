import java.util.ArrayList;

public class Lecture_7a {
    public static boolean printF(int ind, ArrayList<Integer> ds,int[] arr, int s, int sum, int n){
        if(ind == n){
            if(s == sum){
                for (int i : ds) {
                    System.out.printf(i + " ");
                }
                return true;
            }
            else return false;
        }

        ds.add(arr[ind]);
        s += arr[ind];
        if( printF(ind + 1, ds, arr, s, sum, n) == true){
            return true;
        }
       
        ds.remove(ds.size() - 1);
        s -= arr[ind];
        if( printF(ind + 1, ds, arr, s, sum, n) == true){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int [] arr = { 1 , 2, 1 };
        int n = 3;
        int sum = 2;
        ArrayList<Integer> ds = new ArrayList<>();
        printF(0, ds, arr, 0,sum,n);
    }
}
