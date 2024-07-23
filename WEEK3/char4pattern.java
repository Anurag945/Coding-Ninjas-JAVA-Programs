import java.util.Scanner;

public class char4pattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int i=1;
        
        while(i<=n){
            int j=1;
            char startingchar = (char)('A'+i-1);
            while(j<=i){
                System.out.print((char)(startingchar+j-1));
                j++;
                
            }
            System.out.println();
            i++;
 
        }
    }
    
}
/*4
A
BC
CDE
DEFG */