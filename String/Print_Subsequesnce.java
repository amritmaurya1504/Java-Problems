import java.util.ArrayList;

public class Print_Subsequesnce {
    public static void printSubs(String input, String output, int indx){
        if(indx >= input.length()){
          for (int i = 0; i < output.length(); i++) {
              System.out.printf(output.charAt(i) + " ");
          }
          System.out.println();
          return;
        }

        output = output + input.charAt(indx);
        printSubs(input, output, indx + 1);
        output = output.substring(0, output.length()- 1);
        printSubs(input, output, indx + 1);
        

    }
    public static void main(String[] args) {
        printSubs("sampriti", " ", 0);
    }
}
