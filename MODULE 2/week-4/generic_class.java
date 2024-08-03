public class generic_class<t> {
    
    private t first;
    private t second;

    public generic_class(t first,t second){
        this.first=first;
        this.second=second;
    }
}


/*herer t has been used so that this class does not get specific to a data type where as applicable for even other data tyoes we can write data type at place of t while making a an object */