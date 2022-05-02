import java.util.Scanner;

public class Lecture_2 {
    public static void printName(int i ,int n){
        if(i > n){
            return;
        }else{
            System.out.println(i);
            printName(++i,n);
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printName(1,n);
    }
}
