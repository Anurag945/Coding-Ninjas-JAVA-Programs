package WEEK1.lecture2;
import java.util.Scanner;


public class relational_operator {
  public static void main(String[] args) {
    
    try (Scanner S = new Scanner(System.in)) {
		int a = S.nextInt();
		int b = S.nextInt();

		boolean isEq = (a == b );
		System.out.println(isEq);
		
		int i = S.nextInt();
		int j = S.nextInt();
			
			boolean isEqq = (i == j);
			boolean neq = (i != j);
			boolean isgr = (i > j);
			boolean isgreq = (i >= j);
			boolean isless = (i < j);
			boolean isLessEq = (i <= j);
			System.out.println("Is Equal " + isEqq);
			System.out.println("Is Not Equal " + neq);
			System.out.println("Is Greater " + isgr);
			System.out.println("Is Greater Equal " + isgreq);
			System.out.println("Is Less " + isless);
			System.out.println("Is Less Equal " + isLessEq);
	}



  }

    
}
