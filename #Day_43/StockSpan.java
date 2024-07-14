import java.util.Stack;

class Node{

    int value;
    int span;

    public Node(int v, int s){
        this.value=v;
        this.span=s;
    }

}
public class StockSpan {

    
    public StockSpan(){
        Stack<Node> stack= new Stack<Node>();
    }
    public static int next(int price){
        Stack<Node> stack= new Stack<Node>();
            if (stack.isEmpty()) {
                stack.push(new Node(price ,1));
                return 1;
            }else{
                Node prev= stack.peek();
                if (prev.value > price) {
                    stack.push(new Node(price, 1));
                    return 1;
                }else{
                    int count =0;
                    while (!stack.isEmpty() && stack.peek().value <= price) {
                        prev=stack.pop();
                        count= count + prev.span;
                        
                    }
                    stack.push(new Node(price, 1+ count));
                    return 1 + count;
                }
            }
    }
    public static void main(String[] args) {
        int a[]={3,5,7,8};
        System.out.println(next(8));
        
      
    }
}