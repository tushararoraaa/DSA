import java.util.*;

import javax.swing.tree.TreeNode;

public class LevelOrderTraversal {

    public static void levelorder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (q.size() != 0) {
            TreeNode x = q.remove();
            // if (x == null) {
            // System.out.println(); // this will print level wise
            // x.add(null);
            // }
            if (x.left != null) {
                q.add(x.left);
            }
            if (x.right != null) {
                q.add(x.right);
            }
            System.out.print(x.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        levelorder(root);
    }
}
