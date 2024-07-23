package WEEK4.Lecture7;
import java.util.*;
public class for_loop {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
         System.out.println(sum);
    }
    
}
