public class DoublyLinkedList {

    class Node {
        int data;
         Node next;
         Node prev;

         public Node(int data){
            this.data= data;
            this.next= null;
            this.prev= null;

         }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    // printing the list
    public void print(){
        Node temp= head;
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    // ADDFirst method
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if (head == null) {
            head= tail=newNode;
            return; 
        }
        newNode.next= head;
        head.prev= newNode;
        head= newNode;
    }
    // remove == remove from first
    public int removeFirst(){
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) { // this condition can handle the size of the linked list
            int val= head.data;
            head= null;
            size--;
            return val;
        }

        int val = head.data;
        head= head.next;
        head.prev= null; // this condition give you error when the only one node is present in list
        size--;
        return val;

    }

    public static void main(String[] args) {
        DoublyLinkedList dl= new DoublyLinkedList();

        dl.addFirst(1);
        dl.addFirst(2);
        dl.addFirst(3);
        dl.addFirst(4);
        dl.addFirst(5);
        
        dl.print();
        System.out.println(dl.size);

        dl.removeFirst();
        dl.print();
    }
}
