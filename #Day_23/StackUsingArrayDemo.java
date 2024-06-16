    class StackUsingArray {
        private int maxSize;
        private int[] stackArray;
        private int top;
    
        public StackUsingArray(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1; // Initialize top of the stack to -1 (empty stack)
        }
    
        public void push(int value) {
            if (top == maxSize - 1) {
                System.out.println("Stack Overflow! Cannot push " + value);
                return;
            }
            stackArray[++top] = value; // Increment top and then push value
        }
    
        public int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow! Stack is empty.");
                return -1;
            }
            return stackArray[top--]; // Return top element and decrement top
        }
    
        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return stackArray[top]; // Return top element without removing it
        }
    
        public boolean isEmpty() {
            return (top == -1);
        }
    
        public boolean isFull() {
            return (top == maxSize - 1);
        }
    }
    public class StackUsingArrayDemo {
        public static void main(String[] args) {
            
            StackUsingArray stack = new StackUsingArray(5); // Create a stack with size 5
    
            // Pushing elements onto the stack
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
    
            // Trying to push more elements to test overflow condition
            stack.push(60);
    
            // Popping elements from the stack
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Popped element: " + stack.pop());
    
            // Peeking at the top element
            System.out.println("Top element: " + stack.peek());
    
            // Checking if stack is empty or full
            System.out.println("Is stack empty? " + stack.isEmpty());
            System.out.println("Is stack full? " + stack.isFull());
        }
    }
        
    

