import java.util.ArrayList;

public class arraylist {


    public static void main(String[] args) {
        
    
    ArrayList<Integer> list1= new ArrayList<>();
    list1.add(20);
    list1.add(45);
    list1.add(76);
    list1.add(56);
    list1.add(87);


    list1.add(2,34);  // directly to the index


    for(int i=0;i<list1.size();i++){
        System.err.print(list1.get(i)+" ");
    }
    
System.out.println();

    // using for each loop which diectly works on the elemnt of the array

    for(int elemnt:list1){
        System.out.print(elemnt+" ");
    }   
    
}
}
