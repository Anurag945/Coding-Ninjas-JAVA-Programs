public class pvtstudent {
    String name;
    private int rollno;       // As it is private it can only be acced in this class
    
    public void set_roll_no(int ron){    //the function is public so it can acces the private things within the class
        if(ron<0){
            return;
        }else{
            rollno = ron;
        }
    }

    public int get_roll_no(){
        return rollno;
    }
}
