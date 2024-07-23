package WEEK4.Lecture7;
import java.util.Scanner;
public class  isprime_func {
    public static boolean isprime(int n){
        int i=2;
        while(i<n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    } 

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
       boolean ans = isprime(n);
       System.out.println(ans);
    }
    
}
