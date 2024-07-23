import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int startingnum= i;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print(startingnum);
                startingnum++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}

/*3
1
23
456 */