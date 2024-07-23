package WEEK6.LECTURE11;

public class check_palindrome {
    public static boolean check_palindrome(String str){
        String rev= "";
  for(int i=str.length()-1;i>=0;i-- ){
    rev+=str.charAt(i);
  }
  if(rev==str){
    return true;
  }else{
    return false;
  }
    }

    public static void main(String[] args) {
        String str = "abb";
        boolean is_palindrome= check_palindrome(str);
        System.out.println(is_palindrome);
    }
    }