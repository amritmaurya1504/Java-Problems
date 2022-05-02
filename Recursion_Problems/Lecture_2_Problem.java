import java.util.Scanner;

public class Lecture_2_Problem {
    //* print 1 to N by backtracking...
    // public static void printNum(int i, int n){
    //     if(i < 1){
    //         return;
    //     }else{
    //       printNum(i - 1, n);
    //       System.out.println(i);
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     printNum(n,n);
    // }

    //* print N to 1 by backtracking...
    public static void printNum(int i, int n){
        if(i > n){
            return;
        }else{
          printNum(i + 1, n);
          System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(1,n);
    }
}
