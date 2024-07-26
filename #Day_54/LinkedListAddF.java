public class LinkedListAddF {


    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    // to define the head and tail
    public static Node head;
    public static Node tail;

    // in linkedlist to add the element at first side
    public void addFirst(int data){
        //step 1 : create a newNode
        Node newNode= new Node(data);
        if (head == null) {
            head = tail= newNode;
            return;
        }
        //Step 2 : to assign the newNode next to head
        newNode.next= head;

        // step 3: to assign the head as a newNode
        head = newNode;
    }
    // to print the linked List
    public void print(){
        if (head == null) {
            System.out.print("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedListAddF ll= new LinkedListAddF();
        ll.print();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
    }
    
}
