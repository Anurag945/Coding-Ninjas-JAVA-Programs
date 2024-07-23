package WEEK1.lecture2;
import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			
			boolean isALargest = (a >= b) && (a >= c);
			System.out.println(isALargest);
			System.out.println((a >= b) || (a >= c));
			System.out.println(!(a>=b));
		}

    }
	 
    
}
