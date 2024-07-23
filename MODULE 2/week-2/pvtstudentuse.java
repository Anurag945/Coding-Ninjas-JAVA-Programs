import java.util.Scanner;

public class pvtstudentuse {
    public static void main(String[] args) {
        
    
    Scanner s= new Scanner(System.in);
    pvtstudent s1= new pvtstudent();
     s1.name="anurag";
     s1.set_roll_no(5);

     System.out.println(s1.name);
     System.out.println(s1.get_roll_no());  //we already made a function which returns roll no
     
    }
}
