public class LinkedListAddM {

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
    public static int size;


    public void addFirst(int data){
        //step 1: create the new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step 2: to asign the newNode next  to the head
        newNode.next = head;
        //step 3: to assign the head to the newNode
        head= newNode;

    }
    // to add the element at the middle 
    public void addM(int indx, int data){
        if (indx ==0) {
            addFirst(data);
            return;
        }
        //Step 1: create a newNode
        Node newNode= new Node(data);
        size++;
        Node temp= head;

        int i=0;
        while (i < indx-1) {
            temp= temp.next;
            i++;
        }
        // i = indx-1 temp == prev
        newNode.next= temp.next;
        temp.next= newNode;  
    }
    // to add the linklist element at the last position
    public void addLast(int data){
        //step 1: to create the new node
        Node newnode= new Node(data);
        size++;
        if (head == null) {
            head= tail = newnode;
            return;
        }
        //step 2: to assign the tail.next to newNode
        tail.next = newnode;
        // step 3; to assign the tail = newNode
        tail = newnode;
    }
    public void print(){
        if (head ==  null) {
            System.out.print("List is empty");
        }
        Node temp= head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListAddM ll = new LinkedListAddM();
        
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        
        ll.addM(2, 9);
        ll.addM(3, 10); 
        ll.print();
        System.out.println(ll.size);
       
       
    }
    
}
