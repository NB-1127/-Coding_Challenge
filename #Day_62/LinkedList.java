

class TreeNode{
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
         this.right = right;
    }

}
public class LinkedList {

    //437
    static int count=0;
    public static int pathSum(TreeNode root, int targetSum){
        if (root == null) { // if the root note is null it gives the 0
            return 0;
        }
        pathSumHelper(root, targetSum,0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;
    }
    static void pathSumHelper(TreeNode root, int targetSum, long currSum){
        if (root == null) {
            return;
        }
        currSum += root.val;
        if (currSum == targetSum) {
            count ++;
        }

        pathSumHelper(root.left, targetSum, currSum);
        pathSumHelper(root.right, targetSum, currSum);
    }

    public static void main(String[] args) {
        int targetSum=8;

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(1);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.right.right = new TreeNode(11);

       int result= pathSum(root, targetSum);
       System.out.println(result);
    }
}