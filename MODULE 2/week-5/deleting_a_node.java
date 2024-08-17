import java.util.Scanner;

public class deleting_a_node {

    public static Node<Integer> deleteNode( Node<Integer> head, int pos) {

    if(head==null){                              // to check if linked list is empty
      return head;
      }
 
      if(pos==0){                                  // to check is we need to dlt as zero postion then just return its next node
        return head.next;
      }
      

    Node<Integer> temp= head;                      // take a temprorary head
    int count=0;

    while(temp!=null && count<pos-1){              // used this loop to go one position before the target node
        temp=temp.next;
        count++;
    }

    if(temp==null){                              
        return head;
    }
    if(temp.next!=null){                            //used to handle  null node exception 
        temp.next=temp.next.next;
    }
        
    return head;

    }


    public static Node<Integer> takeinput(){
  
      Node<Integer> head= null  ,  tail=null;        // initially head humara null rahega and tail bhi null 
  Scanner s= new Scanner(System.in);                 // input lene ke liye scanner
  int data= s.nextInt();                             // ab hum yaha user se data ka input le lenge

  while(data!=-1){                                   // jab user hume -1 dega hum use end samjh lenge
      Node<Integer> newNode= new Node<>(data);       // ye ek new node create karne ke liye
      if(head==null){                                //ab as hume first node as head initialize krna hai toh hum ye cond apply karenge
          head=newNode;  
          tail=newNode;                            
      }else{

          tail.next=newNode;            
          tail=newNode;                                 // maintain last node as tail node
            
           


      }
      data=s.nextInt();                              // new data lene ke liye
  }

  return head;                                       // HEAD return kar denge taaki hum list access kar sake 

}


    public static void print(Node<Integer> head){
      while(head!=null){
      System.out.print(head.data+" ");
      head=head.next;
      }
      System.out.println();                              // just to chamge the line
  }


  public static void main(String[] args) {
    Node<Integer> head= takeinput();
    deleteNode(head, 0);

    print(head);    
  }



      
}
