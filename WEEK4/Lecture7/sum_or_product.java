package WEEK4.Lecture7;
import java.util.*;
public class sum_or_product {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int c= s.nextInt();
        int sum=0;
        int product=1;
        if(c==1){
            int i=1;
            while(i<=n){
                sum= sum+i;
                i++;
            }
            System.out.println(sum);
        }else if(c==2){
            int i=1;
            while(i<=n){
                product= product*i;
                i++;
            }
            System.out.println(product);
        }else{
            System.out.println("-1");
        }

    }
    
}
