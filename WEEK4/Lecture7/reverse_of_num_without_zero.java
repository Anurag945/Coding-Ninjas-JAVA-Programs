package WEEK4.Lecture7;
import java.util.*;
public class reverse_of_num_without_zero {
 public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    int temp=n;
    int rev=0;
    while(temp>0){
        int last_digit=temp%10;
        temp= temp/10;
        rev = rev*10+last_digit;
    }
    System.out.println(rev);
    
 }
}
