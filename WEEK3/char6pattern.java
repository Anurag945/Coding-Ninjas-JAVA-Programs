import java.util.Scanner;
public class char6pattern {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int i=1;
        
        while(i<=n){
            int j=1;
            char startingchar = (char)('A'+ n-1);
            while(j<=i){
                System.out.print((char)(startingchar));
                j++;
                startingchar--;
               
                
            }
            System.out.println();
            i++;
 
        }
    }
}
/*reverse pattern
 * 5
E
ED
EDC
EDCB
EDCBA
 */