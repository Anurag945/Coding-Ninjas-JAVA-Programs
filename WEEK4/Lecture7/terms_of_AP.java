package WEEK4.Lecture7;
import java.util.Scanner;
public class terms_of_AP {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        int n=1000;
        int i=1;
        int count=1;

        while(i<=n){
        int num=3*i+2;
            if(num%4!=0){
                System.out.print(num+" ");
                count++; 
            }
            if(count==x){
                break;
            }
            i++;
        }

        
    }
    
}
