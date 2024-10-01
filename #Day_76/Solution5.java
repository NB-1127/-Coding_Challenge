import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution5 {

    
    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
       
        int[] tempArray = new int[k];
        
        for (int i = 0; i < k; i++) {
            tempArray[i] = queue.poll(); 
        }

        
        for (int i = k - 1; i >= 0; i--) {
            queue.add(tempArray[i]);
        }

        
        int remaining = queue.size() - k;
        for (int i = 0; i < remaining; i++) {
            queue.add(queue.poll());  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter the elements of the queue (press Enter twice to stop):");

        while (true) {
            String input = scanner.nextLine();
           
            if (input.isEmpty()) {
                break; 
            }
            queue.add(Integer.parseInt(input)); 
        }

        
        System.out.print("Enter the number of elements to reverse (k): ");
        int k = scanner.nextInt();

       
        if (k > queue.size()) {
            System.out.println("k should be less than or equal to the size of the queue.");
            return;
        }

       
        reverseFirstKElements(queue, k);

       
        System.out.println("Modified Queue after reversing first " + k + " elements:");
        for (int element : queue) {
            System.out.print(element + " ");
        }

       
    }
}
