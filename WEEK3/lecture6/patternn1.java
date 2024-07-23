package lecture6;
import java.util.Scanner;
public class patternn1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int p=1;
        while(i<=n){
            int j = 1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            while (j<=i) {
                
                System.out.print(p);
                j++;
                p++;
            } 
             p=1;
            System.out.println();
            i++;
        }
    }
    
}

/*
 * 5
    1
   12
  123
 1234
12345
 */
