import java.util.*;
 
public class ReverseFirstKElements {
 
    static void reverseQueueFirstKElementsUsingStack(Queue<Integer> queue, int k)
    {
        if (queue.isEmpty() == true || k > queue.size())
            return;
        if (k <= 0)
            return;
 
        Stack<Integer> stack = new Stack<Integer>();
 
        // Push the first K elements into a Stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }
 
        // Enqueue the contents of stack
        // at the back of the queue
        while (!stack.empty()) {
            queue.add(stack.peek());
            stack.pop();
        }
 
        // Remove the remaining elements and enqueue
        // them at the end of the Queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }
 
    static void reverseQueueFirstKElementsUsingRecursion(Queue<Integer> queue, int k) {
       helper(queue, k); // Step 1 and 2
       int sz = queue.size() - k; // Step 3
       while( sz-- > 0){
           int x = queue.poll();
           queue.add(x);
       }
   }
   static void helper(Queue<Integer> queue, int k){
       if(k == 0) return;
       int e = queue.poll();
       helper(queue, k - 1);
       queue.add(e);
   }
 
    // Driver code
    public static void main(String args[])
    {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
 
        int k = 5;
        reverseQueueFirstKElementsUsingStack(queue, k);
 
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
}