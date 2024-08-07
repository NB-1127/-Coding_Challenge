public class LinkedListP {


    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode= new Node(data);
        if (head == null) {
            head= tail= newNode;
        }
        tail.next= newNode;
        tail= newNode;
       
    }

    public void print(){
        Node temp= head;
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data+ "->");
            temp= temp.next;
        }
        System.out.println("null");

    }
    // to trac the slow and fast pointer to calculate the mid point
    public Node findMiddleNode(Node head){
        Node slow= head;// it goes +1
        Node fast= head;// it goes +2

        while (fast != null && fast.next != null) {
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }

    // to check the list is palindrom or not
    public boolean checkPalindrom(){
        if (head == null || head.next== null) {
            return true;
        }

        //find the midpoint
        Node mid= findMiddleNode(head);

        //reverse the 2nd half
        Node prev= null;
        Node curr=mid;
        Node next;
        while (curr != null) {
            next= curr.next;
            curr.next= prev;
            prev = curr;
            curr= next;

        }
        Node right= prev;// this is head of the right side
        Node left= head;// this is head of the left side

        // check if it equal
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left= left.next;
            right= right.next;
        }
        return true; 
    }

    public static void main(String[] args) {
        LinkedListP ll= new LinkedListP();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();

        System.out.println(ll.checkPalindrom());
    }
}