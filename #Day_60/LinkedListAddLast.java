public class LinkedListAddLast {

    public static class Node{

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
        Node newNode= new Node(data);
        if (head == null) {
            head= tail= newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void print(){
        Node temp= head;
        if (head == null) {
            System.out.print("list is empty ");
        }
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedListAddLast ll= new LinkedListAddLast();

        ll.print();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

    }
}