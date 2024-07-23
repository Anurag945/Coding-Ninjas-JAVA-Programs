package WEEK4.Lecture7;
import java.util.*;

import lecture6.isoceles_triangle;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        int temp=num;
        double dec=0;
        int i=0;
        int p=0;
        while(temp>0){
            
           i=temp%10;
         temp=temp/10;
         dec= (int)dec+i*Math.pow(2, p);
         p++;  
        }
        System.out.println((int)dec);
    }
    
}
