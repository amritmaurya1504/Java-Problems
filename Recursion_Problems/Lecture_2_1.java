import java.util.Scanner;

public class Lecture_2_1 {
    public static void printName(int n){
        if(n == 0){
            return;
        }else{
            System.out.println(n);
            printName(--n);
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printName(n);
    }
}