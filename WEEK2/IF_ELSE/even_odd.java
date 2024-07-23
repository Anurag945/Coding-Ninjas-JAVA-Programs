package IF_ELSE;
import java.util.Scanner;

public class even_odd {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();

            int no = n%2;

      if (no == 0) {
            System.out.println("the number is even");
            
      }
      else{
            System.out.println("the number is odd");
      }
        }

    }
    
}
