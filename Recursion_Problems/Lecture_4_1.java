public class Lecture_4_1 {
    public static boolean isPalindrome(int i, String s){
        if(i >= s.length() / 2) return true;
        if(s[i] != s[s.length() - i - 1]) return false;
        isPalindrome(i+1, s);
    }
    public static void main(String[] args) {
        String s = "madam";
        if(isPalindrome(0 , s) == true){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
