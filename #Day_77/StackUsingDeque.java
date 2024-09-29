import java.util.*;
public class StackUsingDeque {

    static class Satck{

        Deque<Integer> deque= new LinkedList<>();

        public void push(int data){

            deque.addLast(data);
        }

        public int pop(){

            return deque.removeLast();
        }

        public int peek(){

            return deque.getLast();
        }


    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek element from it:"+s.peek() + " ");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    
}
