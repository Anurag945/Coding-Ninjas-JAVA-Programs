                             // import module2.student;
import java.util.*;
public class studentuse {             
        
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    student s1 = new student();    // we have created a class file erlier  {if file is not in same folder we need to write import statement}
    student s2 = new student();
    s1.name= "Anurag";   // s1.name is used to acces the location where template is created
    s1.age= 21;

    s2.name="rohan";
    s2.age= 21;

    System.err.println(s1.name);
    System.out.println(s2.name);
  }



    
}
