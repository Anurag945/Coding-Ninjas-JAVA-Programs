

public class print_ith_ll {
    
 public static void printIthNode(Node<Integer> head, int i){
    int index=0;
    Node<Integer> current=head;
    if(index!=i && current!=null){
      current=current.next;
      index++;

    }
    if(index==i && current!=null){
      System.out.print(current.data);
    }
 }



}
