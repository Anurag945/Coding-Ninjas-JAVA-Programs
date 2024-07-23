package WEEK6.LECTURE11;

public class print_all_substring {

    public static void printsubstring(String str){
        for(int start=0;start<str.length();start++){
            for(int end=start;end<str.length();end++){

                System.out.println(str.substring(start, end+1));


            }
        }
    }
    public static void main(String[] args) {
        String str= "pqrs";
        printsubstring(str);
    }
    
}
