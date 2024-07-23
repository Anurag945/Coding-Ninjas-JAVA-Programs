package WEEK6.LECTURE11;

public class reverse_string {

    public static String reverseString(String str){
        String reversedstring = "";
   for(int i=str.length()-1;i>=0;i--){
             reversedstring+= str.charAt(i);   // one more approach  reversedstring= str.charAt(i)+ reversedstring;
   }
   return reversedstring;

    }

    public static void main(String[] args) {
        String str="Anurag";

        String rev= reverseString(str);
        System.out.println(rev);
    }
    
    
}
