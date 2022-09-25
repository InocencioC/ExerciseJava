import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    
    public static void main(String[] args) {

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
          } catch (Exception e) {
            System.out.println("Ops, algo deu errado.");
          }
    }

}
