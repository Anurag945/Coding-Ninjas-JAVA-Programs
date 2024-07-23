package WEEK4.Lecture7;
import java.util.Scanner;
public class FIBONACCHI_s_no {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num= s.nextInt();
        int a=1;
        int b=1;

        for(int n=1;n<num;n++){
            int c= a+b;
                a=b;
                b=c;

        }
    System.out.println(a);

    }
    
}
