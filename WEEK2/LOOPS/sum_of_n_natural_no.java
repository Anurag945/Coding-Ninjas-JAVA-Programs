package LOOPS;
import java.util.Scanner;
public class sum_of_n_natural_no {
   public static void main(String[] args) {
      
   Scanner s= new Scanner(System.in);
   
   int n = s.nextInt();
   int i = 1 ;
   int sum = 0;

   while(i <= n){
    sum = sum + i;
    i= i+1;

   }

   System.out.println(sum);

   }
    
}
