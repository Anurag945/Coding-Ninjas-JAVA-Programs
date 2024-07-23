package WEEK1.lecture2;
import java.util.Scanner;

public class ferhnite_to_celcius {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f = s.nextInt();
        int cel = (5/9)*(f-32);
        System.out.println(cel);
    }
    
}
