public class BinaryTreePreOrder {

    static class Node{

        int data; 
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
            
        }
    }
    static class BinaryTree{
        static int indx=-1;
        public static Node buildBinaryTree(int node[]){
            indx++;
            if (node[indx] == -1) {
                return null;
            }
            
            Node newNode= new Node(node[indx]);
            newNode.left=buildBinaryTree(node);
            newNode.right=buildBinaryTree(node);
            
            return newNode;
        }
        public static void preorder(Node root){
            if (root == null) {
                return;
            }
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
            
        }

        
        public static void inorder(Node root){
           
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
           
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+ " ");
        }
        
    }

    

    public static void main(String[] args) {
        int node[]={1 , 2, 4 , -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree= new BinaryTree();        
        Node root= tree.buildBinaryTree(node);
        // System.out.println("Root Node of the Binary tree : "+ root.data);

        System.out.println("PreOrder Traversal");
        tree.preorder(root);
        System.out.println();
        System.out.println("inOrder Traversal");
        tree.inorder(root);
        System.out.println();
        System.out.println("PostOrder Traversal");
        tree.postorder(root);

    }
}