public class Constructor_class {
 String name;
 int  rollno;     // final keyword can also be for final intialization "final int rollno= 100"

public Constructor_class(String n,int rn){ //we created a constructor so every time while creating a class the user need to enter the parameters
    name= n;
    rollno=rn;                            // in this constructor one initialised itcannot be changed 
}

public Constructor_class(String n){ // using this constructor only name can also be passed through the constructor as per convinience;
    name= n;
}                                   // avoiding this constructor is better because as a constructor works works as a final it cannot be changed 



public void print(){
    System.out.println(name);
    System.out.println(rollno);
}
    
}
