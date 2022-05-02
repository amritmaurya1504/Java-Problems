public class Lecture_5_Recursion{
    public static int function(int n){
        if(n<=1) return n;
        return function(n-1) + function(n-2);
    }
    public static void main(String[] args) {
        System.out.println(function(4));
        //Nth = Fibonacii Number
    }
}