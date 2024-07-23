package lecture6;

import java.util.*;
public class dimond_pattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N=s.nextInt();
        int n1 = (N+1)/2;
        int n2= n1-1;
        int i = 1;

        while(i<=n1){
            int spaces=1;
            while(spaces<=n1-i){
                System.out.print(" ");
                spaces++;

            }
            int j=1;
            while(j<=2*i-1){
                System.out.print("*");
                j++;
            }
          i++;
          System.out.println();
            
        }

        i=n2;
    while(i>=1){
    int spaces = 1;
    while(spaces<=(n2-i+1)){
        System.out.print(" ");
        spaces++;
    }
    int j = 1;
    while(j<=2*i-1){
        System.out.print("*");
        j++;
    }
    System.out.println();
    i--;

    }
        
    }
}

/*
 *
 *  5
  *
 ***
*****
 ***
  *
 */