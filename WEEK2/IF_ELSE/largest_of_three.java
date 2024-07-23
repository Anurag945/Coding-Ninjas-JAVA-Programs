package IF_ELSE;

import java.util.Scanner;

public class largest_of_three {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            int num3 = s.nextInt();
            
      
            if(num1 >= num2 && num1 >= num3){
                System.out.println(num1 + " is largest no");
            }
            else if (num2 >= num1 && num2 >= num3){
                System.err.println(num2 + " is the largest no");
            }
            else {
                System.out.println(num3 + " is the largest no");
            }
        }

    
        
    }
    
}
