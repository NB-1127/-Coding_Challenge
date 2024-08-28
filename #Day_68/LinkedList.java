public class LinkedList {
   
    class Node {
    
        int data;
        Node next;
        Node(int data){
        this.data=data;
        this.next=null;

    }
        
    }
    public static Node head;
    public static Node tail;

    public void  addFirst(int data){
        Node newNode= new Node(data);
        if (head== null) {
            head= tail= newNode;    
            return;        
        }
        newNode.next= head;
        head= newNode;
    }
    public void print(){
        Node temp= head;
        if (head== null) {
            System.out.print("List is null");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
    }
    
}
