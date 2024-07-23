import java.util.Scanner;

public class char5pattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int i=1;
        
        while(i<=n){
            int j=1;
            char startingchar = (char)('A'+ n-i);
            while(j<=i){
                System.out.print((char)(startingchar+j-1));
                j++;
               
                
            }
            System.out.println();
            i++;
 
        }
    }
    
}
/*5
E
DE
CDE
BCDE
ABCDE */
