import java.util.Scanner;

public class inserion_LL {

    public static Node<Integer> insert(Node<Integer> head,int data,int pos){
        Node<Integer> newNode=new Node<>(data);                         // pehle ek node bana lenge jisme new data hoga

        if(pos==0){
            newNode.next=head;                 // new nde ke next mai head connect kr denge so newnode 0 index pe aa jaayega
            
            return newNode;  // kyuki hume newnode ko head banana hai coz first node ab change ho chuka hai toh is liye hum ye new node return

        }


        int i=0;            // i position-1 tak jaayega
        Node<Integer> temp= head;      // temp mai head head le lenge taaki hum use update krte krte ne=pos-1 pe pohoch saku;
        if(i<pos-1){
               temp=temp.next;        // for travelling in linked list
               i++;
        }

        newNode.next=temp.next;       // this is for connecting new node's next with its next
        temp.next=newNode;           // this is for connection pos-1 to its next node whi h is the new node
         return head; //kyuki koi head change nhi hua but we need to return head in functon coz of its rteun type so we return same head

    }
    public static void print(Node<Integer> head){
        while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
        }
        System.out.println();                              // just to chamge the line
    }



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

    public static void main(String[] args) {
        Node<Integer> head=takeinput();
        head= insert(head, 80, 0);  // function humaara head return karega is liye


    print(head);

        
    }
    
}
