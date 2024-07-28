public class LinkedListS {

    public class Node {
        
        int data;

        Node next;

        public Node(int data){
            this.data= data;
            this.next= null;

        }
        
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data){
        //Step 1: to create new Node
        Node newNode= new Node(data);
        if (head == null) {
            head= tail= newNode;
        }

        // step 2: tailnext to newnode
        tail.next= newNode;
        
        // step : tail.next to newnode
        tail= newNode;
    }
    public void print(){
        Node temp= head;
        if (head == null) {
            System.out.print("list is null");
        }
        while (temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        int val= head.data;
        head= head.next;
        return val;
    }

    public static void main(String[] args) {
        LinkedListS list =new LinkedListS();
        list.print();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.print();

        list.removeFirst();
        list.print();
    }
}