public class LinkedListAddL {


    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    // to assign the head and null
    public static Node head;
    public static Node tail;

    // to add the linklist element at the last position
    public void addLast(int data){
        //step 1: to create the new node
        Node newnode= new Node(data);
        if (head == null) {
            head= tail = newnode;
            return;
        }
        //step 2: to assign the tail.next to newNode
        tail.next = newnode;
        // step 3; to assign the tail = newNode
        tail = newnode;
    }
    // to print the linkedList
    public void print(){
        if (head == null) {
            System.out.print("List is empty");
        }
        //to assign the head as the temp node to move forword and print the data
        Node temp= head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedListAddL ll= new LinkedListAddL();

        ll.print();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
    }
    
}
