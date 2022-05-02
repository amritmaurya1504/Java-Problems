public class Lecture_1{
    public static int count = 0;
    public static void print(){
        if(count == 10){
            return;
        }else{
            System.out.println(count);
            count++;
            print();
        }
    }
    public static void main(String[] args) {
        print();
    }
}