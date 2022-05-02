public class Lecture_3_Task {
    public static int facto(int n){
        if(n == 0){
            return 1;
        }
        else{
            int fact = n*facto(n-1);
            return fact;
        }
    }
    public static void main(String[] args) {
        System.out.println(facto(4));
    }
}
