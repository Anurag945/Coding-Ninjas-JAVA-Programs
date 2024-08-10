public class print_Linkedlist {

    public static void main(String[] args) {
  

        Node<Integer> node1= new Node<>(10);
        Node<Integer> node2= new Node<>(20);
        Node<Integer> node3= new Node<>(30);
        Node<Integer> node4= new Node<>(40);

        // now link the nodes

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        // now we need to initialize node 1 as head 

        Node<Integer> head = node1;


        while(head !=null){
            System.out.print(head.data+" ");
            head=head.next;    // using this we increae the head data
        }


    }
    
}
