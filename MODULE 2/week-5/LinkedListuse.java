// in this file using the mode class we will create nodes(objects of node class)
// in thgis file we will be creating two nodes and then we will link them togther
public class LinkedListuse {

    public static void main(String[] args) {
        Node<Integer> Node1=new Node<>(10);  // here we created our first node
         
        Node<Integer> Node2= new Node<>(20); //created second node


        // now we need to link them first node1 will have reference adress of node2

        Node1.next=Node2;
        // here we linked them togther

        // now we will print to check the adress just for proof and explanation

        System.out.println(Node2);
        System.out.println(Node1.next);







    }
    
}
