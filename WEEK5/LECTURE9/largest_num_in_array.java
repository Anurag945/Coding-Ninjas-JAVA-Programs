package WEEK5.LECTURE9;
import java.util.Scanner;
public class largest_num_in_array {
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        if(max<arr[i]){
            max=arr[i];
        }
        return max;
    }
    
    public static void main(String[] args) {
        int arr[]= new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i;
        }
     int largest= largest(arr);
     System.out.println(largest);
        
    }
}
