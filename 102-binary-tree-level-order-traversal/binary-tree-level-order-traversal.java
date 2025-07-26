/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void order(TreeNode node, int level) {
        if (ans.size() == level) {
            ans.add(new ArrayList<Integer>());
        }
        ans.get(level).add(node.val);
        if (node.left != null) {
            order(node.left, level + 1);
        }
        if (node.right != null) {
            order(node.right, level + 1);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        // List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        order(root, 0);
        return ans;
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.offer(root);

        // while (!queue.isEmpty()) {
        //     int levelSize = queue.size();
        //     List<Integer> currentLevel = new ArrayList<>(levelSize);
        //     for (int i = 0; i < levelSize; i++) {
        //         TreeNode currentNode = queue.poll();
        //         currentLevel.add(currentNode.val);
        //         if (currentNode.left != null) {
        //             queue.offer(currentNode.left);
        //         }
        //         if (currentNode.right != null) {
        //             queue.offer(currentNode.right);
        //         }
        //     }
        //     result.add(currentLevel);
        // }
        // return result;
    }
}