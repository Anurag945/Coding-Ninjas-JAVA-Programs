package WEEK4.Lecture7;
import java.util.*;
public class dec_to_binary {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int num=n;
        int i =0;
        int rev=0;
        int pv=1;
        while(num>0){
            i = num%2;
            num=num/2;
            rev= i*pv+rev;   // for reversing the no
            pv = pv*10;

        }
        System.out.println(rev);
        
    }
    
}
