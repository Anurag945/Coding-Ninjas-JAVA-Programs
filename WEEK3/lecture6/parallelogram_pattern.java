package lecture6;
import java.util.Scanner;

public class parallelogram_pattern {
    public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n){
			int j = 1;
			int spaces = 1;
			while(j<=i-1){
                System.out.print(" ");
                j++;
			}
            int p = 1;
            while(p<=n){
                System.out.print("*");
                p++;
            }
            i++;
            System.out.println();
		}

	}
}
