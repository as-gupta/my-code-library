import java.util.*;
import crio.ds.Tree.TreeNode;

/*
// Definition of TreeNode
public class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}
*/
public class Solution {

    public List<List<Long>>  zigzagLevelOrder(TreeNode root) {

        List<List<Long>> res = new ArrayList<List<Long>>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        boolean from_left = true;

        while (!queue.isEmpty()) {

            // We will have all next level child nodes in the queue.

            int num_level_nodes = queue.size();

            List<Long> curr_level = new LinkedList<Long>();

            for (int i = 0; i < num_level_nodes; i++) {

                TreeNode curr_node = queue.poll();

                if (from_left)
                    curr_level.add(curr_node.val);
                else 
                    curr_level.add(0, curr_node.val); // Insert at other end

                if (curr_node.left != null)
                    queue.offer(curr_node.left);
                if (curr_node.right != null)
                    queue.offer(curr_node.right);
            }

            res.add(curr_level);
            from_left = !from_left;
        }

        return res;
    }
}