public class Tree {

    public static class Node {
        
        int data;

        Node next;

        public Node(int data){

            this.data=data;

            this.next= null;
        }
        
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //step 1: Node
        Node newNode= new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }
    public void print(){
        Node temp= head;
        if (head == null) {
            System.out.print("list is empty");
        }
        while (temp != null) {
            System.out.print(temp.data+ "->");
            temp= temp.next;  
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        
        Tree tree= new Tree();
        tree.print();
        tree.addFirst(5);
        tree.addFirst(4);
        tree.addFirst(3);
        tree.addFirst(2);
        tree.addFirst(1);
        tree.print();
    }
}