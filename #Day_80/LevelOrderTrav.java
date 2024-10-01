import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTrav {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right= null;
        }

    }
    static class BinaryTree{
        static int indx=-1;
        public static Node builfBinaryTree(int node[]){
            indx++;
            if (node[indx] == -1) {
                return null;
            }
            Node newNode= new Node(node[indx]);
            newNode.left= builfBinaryTree(node);
            newNode.right= builfBinaryTree(node);

            return newNode;
        }

        // Level Order Taversal
        public static void levelOrder(Node root){

            if (root == null) {
                return;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode= q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int node[]={1 , 2, 4 , -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree= new BinaryTree();        
        Node root= tree.builfBinaryTree(node);
        

        tree.levelOrder(root);
    }
    
}
