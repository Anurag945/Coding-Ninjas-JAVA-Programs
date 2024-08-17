public class increment_every_value_ll {

    // function to increment every value in java

    public static void increment(Node<Integer> head){
        Node<Integer> temp=head;
        
        while(temp!=null){
        temp.data++;
        temp=temp.next;
        }
    }
    
}
