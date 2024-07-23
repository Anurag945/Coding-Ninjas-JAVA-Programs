package WEEK5.LECTURE9;

public class print_all_pairs {

    public static void printallpairs(int[] arr){

        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){                          /* here j= i+1 is written so same like (4,4),(7,7)...will not get print */
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
         
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int[] arr={1,4,7,6,5};
        printallpairs(arr);
        
    }
    
}


/*solved  */