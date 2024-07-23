package WEEK4.Lecture7;
import java.util.Scanner;
public class print_prime_no {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int i = 1;
        while(i<=n){
            int sum=1;
             for(int d=2;d<=i;d++){
                if(i%d==0){
                    sum++;
                }
             }
             if(sum==2){
                System.out.println(i);
            }
             i++;
        }
    }
 }

 /*
 for n = 9
2
3
5
7 
*/
