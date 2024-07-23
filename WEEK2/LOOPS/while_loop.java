package LOOPS;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
             int i = 0;

             while (i <= n){
                System.out.println(i);
                i= i+1;
             }
        }

    }
}
