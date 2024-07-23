public class UnivaluedBinaryTree {

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1); // to insert the value in tree node
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(1);
        root1.right.right = new TreeNode(1);

        // Creating the tree [2,2,2,5,2]
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(5);
        root2.left.right = new TreeNode(2);

        UnivaluedBinaryTree main = new UnivaluedBinaryTree();
        
        // Testing the isUnivalTree method
        System.out.println("Is the first tree a unival tree? " + main.isUnivalTree(root1)); // Should print true
        System.out.println("Is the second tree a unival tree? " + main.isUnivalTree(root2)); // Should print false
    }

    public boolean isUnivalTree(TreeNode root){

        if(root == null) return true;
        
        if (root.left != null && root.val !=root.left.val) return false;

        if (root.left != null && root.val !=root.right.val) return false;
        
        boolean leftcall= isUnivalTree(root.left);
        boolean rightcall= isUnivalTree(root.right);

        return leftcall && rightcall ;

    
        }
    }

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}