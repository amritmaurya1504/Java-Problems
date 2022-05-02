import java.util.ArrayList;

public class Lecture_6_Print_all_subsequences {
    public static void printSubs(int indx, ArrayList<Integer> ds, int arr[], int n) {
        if (indx == n) {
            for (int i : ds) {
                System.out.printf(i + " ");
            }
            if (ds.size() == 0) {
                System.out.println("[]");
            }
            System.out.println();
            return;
        }

        ds.add(arr[indx]);
        printSubs(indx + 1, ds, arr, n);
        ds.remove(ds.size()-1);
        printSubs(indx + 1, ds, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        int n = arr.length;
        ArrayList<Integer> ds = new ArrayList<>();
        printSubs(0, ds, arr, n);
    }
}
