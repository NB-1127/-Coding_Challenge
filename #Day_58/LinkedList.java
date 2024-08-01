public class LinkedList {


    public static class Node {
    
        int data;

        Node next;

        public Node(int data){
            this.data= data;
            this.next= null;
        }
        
    } 
    public static Node head;
    public static Node tail;

    public void addFirst(int data){

        Node newNode= new Node(data);
        if (head == null) {
            head= tail= newNode;
            return;
        }
        newNode.next= head;

        head= newNode;


    }
    public void print(){
        Node temp= head;
        if (head == null) {
            System.out.print("list is empty");
        }
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
        LinkedList list= new LinkedList();
        list.print();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.print();
    }
}