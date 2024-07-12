import java.util.Stack;

public class StackL {
    
    public static boolean isValid(String s){
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack= new Stack<>();
        boolean flag= true;
        for(Character c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            
            }else if(c == ')' && !stack.isEmpty()){
                char top= stack.peek();
                if (top == '(' && !stack.isEmpty()) {
                    stack.pop();
                }else{
                    flag=false;
                    break;
                }
            }else if(c == '}' && !stack.isEmpty()){
                char top= stack.peek();
                if (top == '{') {
                    stack.pop();
                }else{
                    flag=false;
                    break;
                }
            }else if(c == ']' && !stack.isEmpty()){
                char top= stack.peek();
                if (top == '[') {
                    stack.pop();
                }else{
                    flag=false;
                    break;
                }
            }else{
                flag=false;
            }
        }
        if (!stack.isEmpty()) 
            flag=false;
            return flag;
    }
    public static void main(String[] args) {
        

        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
}
