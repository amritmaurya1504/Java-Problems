import java.util.ArrayList;

public class Subsequence {
    public static void printSubs(int indx, String s, ArrayList<Character> ds, int n) {
        if (indx == n) {
            for (int i = 0; i < ds.size(); i++) {
                System.out.printf(ds.get(i) + " ");
            }
            if (ds.size() == 0) {
                System.out.println("[]");
            }
            System.out.println();
            return;
        }

        ds.add(s.charAt(indx));
        printSubs(indx + 1, s, ds, n);
        ds.remove(ds.size() - 1);
        printSubs(indx + 1, s, ds, n);

    }

    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        ArrayList<Character> ds = new ArrayList<>();
        printSubs(0, s, ds, n);
    }
}