import java.util.LinkedList;
import java.util.Queue;

public class OueueE {

    
    public static void main(String[] args) {
        
        Queue<Integer> queue=new LinkedList<>();

        queue.add(5);// adding wlwmwnt
        int front=queue.peek(); // give the first element of the top
        boolean check=queue.isEmpty(); // to check the list is empty or not
        queue.size(); // to check the size of the list
        System.out.println(queue.size());
        queue.poll(); // remove the element in front 
        System.out.println(front);
        System.out.println(check);

    }
}