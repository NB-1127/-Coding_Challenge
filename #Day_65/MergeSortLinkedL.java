
import java.util.LinkedList;

public class MergeSortLinkedL {


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

    public Node getMid(Node head){

        Node slow= head;
        Node fast= head.next;

        while (fast != null && fast.next != null) {
            slow= slow.next;// +1
            fast= fast.next.next; // +2
        }
        return slow; // mid node
    }

    public Node merge(Node head1, Node head2){
        Node mergell= new Node(-1);
        Node temp= mergell;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next= head1;
                head1= head1.next;
                temp= temp.next;
            }else{
                temp.next= head2;
                head2= head2.next;
                temp= temp.next;
            }
        }
        while (head1 != null) {
            temp.next= head1;
            head1= head1.next;
            temp= temp.next;
        }
        while (head2 != null) {
            temp.next= head2;
            head2= head2.next;
            temp= temp.next;
        }
        return mergell.next;
    }

    public Node mergeSort(Node head){
        if (head == null || head.next== null) {
            return head;
        }
        // find mid
        Node mid= getMid(head);

        // left and right
        Node rightNode= mid.next;
        mid.next= null;
        Node newleft=mergeSort(head);
        Node newright=mergeSort(rightNode);

        //merge
        return merge(newleft,newright);
    }

    public void print(){
        Node temp= head;
        if (head == null) {
            System.out.print("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    // ADDFirst method
    public void addFirst(int data){
        Node newNode= new Node(data);
        if (head == null) {
            head= tail=newNode;
            return; 
        }
        newNode.next= head;
        head= newNode;
    }

    public static void main(String[] args) {
        
        MergeSortLinkedL ln= new MergeSortLinkedL();

        ln.addFirst(1);
        ln.addFirst(2);
        ln.addFirst(3);
        ln.addFirst(4);
        ln.addFirst(5);
        
        ln.print();
        
        ln.head= ln.mergeSort(ln.head);
        ln.print();

    }
}