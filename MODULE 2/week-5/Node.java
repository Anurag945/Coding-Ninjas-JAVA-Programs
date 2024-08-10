// so here I need to make a generic node (which is basically a calss)
public class Node<T> {
    T data;
    Node<T> next;
    
    // now we make a constructor

    Node(T data){
        this.data=data;
         next=null;
    }

}

// so now basically we have created a node templaate and then in another file using this class/template we will be creating nodes(ojects of the class)
