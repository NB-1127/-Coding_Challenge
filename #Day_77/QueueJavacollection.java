import java.util.*;
public class QueueJavacollection {

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        // Queue is an interface so we cant create clss from it
        // we can implement is Queue by using LinkedList and ArrayDeque class
        // Queue<Integer> q= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
