public class generic_method {

    // thhis class prints the array initialy named as print

    public static<T extends printinterface> void printarray(T a[]){   //ab ye method ek generic method hai and isme koi data type defined nahi hai but hum use krte hue apna data type describe kar sakte hain so we can use this method for different data types

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
    
public static void main(String[] args) {
    Integer a[]= new Integer[10];
    for(int i=0;i<a.length;i++){
        a[i]=i+1;
    }

    String s[]= new String[10];
    for(int i=0;i<a.length;i++){
        s[i]="abc";
    }

    //printarray(a);     coz they dont implement printminterface
    //printarray(s);

    //so as we see the same method is applicable to int as well as string  
     
    
    Student s1[]= new Student[10];
    for(int i=0;i<a.length;i++){
        s1[i]= new Student();
    }

    printarray(s1); // yaaha error nahi hai kyuki maine sudent class ko student class implemnts printinterface kiya hai
}



}
