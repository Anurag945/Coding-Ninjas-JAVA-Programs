import java.util.Scanner;
public class charpattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        char ch = 'A';
        while(i<=n){
            int j = 1;
            while(j<=n){
                System.out.print((char)('A'+j-1));
                j++;
            }
            System.out.println();
            i++;
        }
        
    }
    
}

/*4
ABCD
ABCD
ABCD
ABCD */
