package WEEK1.lecture2;
import java.util.Scanner;


public class simpleinterestwithinput {


    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int p = scan.nextInt();

            int r = scan.nextInt();

            int t = scan.nextInt();

            int si = (p*r*t)/100;

            System.out.println(si);


            long l = scan.nextLong();                    // for taking input in long


      // FOR TAKING character inpiut we use string


      String str = scan.nextLine();
      System.out.println(str);

              // for taking character from the string
              char c = str.charAt(0);
        }




    
    
        
    }

   
    
}
