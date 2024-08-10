import java.util.Scanner;

public class taking_LL_inout {


public static Node<Integer> takeinput(){
  
            Node<Integer> head= null;                          // initially head humara null rahega
        Scanner s= new Scanner(System.in);                 // input lene ke liye scanner
        int data= s.nextInt();                             // ab hum yaha user se data ka input le lenge

        while(data!=-1){                                   // jab user hume -1 dega hum use end samjh lenge
            Node<Integer> newNode= new Node<>(data);       // ye ek new node create karne ke liye
            if(head==null){                                //ab as hume first node as head initialize krna hai toh hum ye cond apply karenge
                head=newNode;                              
            }else{
                Node<Integer> temp=head;                   // ab as data hume last node pe initialize karna hai toh hum cond apply karenge
                while(temp.next!=null){                    // ab last node pe jaane ke liye condn
                    temp=temp.next;                        // till last
                }
                temp.next=newNode;                         // 
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
        print(head);
    }
    
}


