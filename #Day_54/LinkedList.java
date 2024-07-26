public class LinkedList {

    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

     // element at added the fist side of the linked list
     public void addFirst(int data){
        // step  :  create new Node 
        Node newNode= new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
       
        // step2:  to assign the newNode next to head
        newNode.next=head;

        // step 3: to assign the head as newnode
        head=newNode;


    }
    public void addLast(int data){
        //Step 1: to create new node
        Node newNode= new Node(data);
        if (head == null) {
            head= tail = newNode;
            return;
        }
        //step 2: to assign newNode net to tail
        tail.next= newNode;
        //step : to assign tail as the newnode
        tail=newNode;
    }
    public void print(){
        if (head== null) {
            System.out.print("LL is empty ");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        LinkedList ll= new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
      
       

    }
}