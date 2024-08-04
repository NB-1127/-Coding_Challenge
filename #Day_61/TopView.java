import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;




class TreeNode{

    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val=val;
        left=right= null;
    }
}
class Pair{
    TreeNode node;
    int x;

    Pair(TreeNode node , int x){
        this.node=node;
        this.x=x;

    }
}
public class TopView {


    static ArrayList<Integer> printTopView(TreeNode root){

        TreeMap<Integer, Integer> mp=new TreeMap<>();
        Queue<Pair> q= new LinkedList<>();

        Pair p= new Pair(root, 0);
        q.add(p);

        while (q.size()>0) {
            
            Pair pp= q.remove();

            TreeNode currentNode= pp.node;
            int cuuX= pp.x;

            if (mp.containsKey(cuuX)==false) {
                
                mp.put(cuuX, currentNode.val);
            }
            if (currentNode.left != null) {
                Pair leftPair= new Pair(currentNode.left, cuuX-1);
                q.add(leftPair);
            }
            if (currentNode.right != null) {
                Pair rightpair= new Pair(currentNode.right, cuuX+1);
                q.add(rightpair);
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for (Map.Entry<Integer, Integer> i: mp.entrySet() ) {
         
            ans.add(i.getValue());
        }
        return ans;
    }


    public static void main(String[] args) {
        // Enter data in right and left node
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Getting the top view of the binary tree
        ArrayList<Integer> topView = printTopView(root);

        // Printing the top view
        System.out.println("Top view of the binary tree is: " + topView);
    }
    
}
