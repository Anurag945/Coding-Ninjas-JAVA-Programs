package WEEK5.LECTURE9;
import java.util.Scanner;
public class arrayy {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size = s.nextInt();
        int arr[]= new int [size];
        for(int i=0;i<size;i++){
             arr[i]= s.nextInt();

        }
        
        for(int j=0;j<size;j++)
        System.out.println(arr[j]);

    }
    
}
