package Algorithms.lessonTen;

public class DFSExample {
    // Deep First Search
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.setLeft(left);
        root.setRight(right);
        TreeNode l1 = new TreeNode(4);
        TreeNode r1 = new TreeNode(5);
        left.setLeft(l1);
        left.setRight(r1);
        TreeNode l2 = new TreeNode(6);
        TreeNode r2 = new TreeNode(7);
        right.setLeft(l2);
        right.setRight(r2);

        int target = 10;
        DFSExample dfsExample = new DFSExample();
        System.out.println("Path exists: " + dfsExample.pathExists(root, target));
    }

    private boolean pathExists(TreeNode node, int sum) {
        // 1. Corner case
        if (node == null) {
            return false;
        }
        // 2. Corner case
        if (node.getRight() == null || node.getLeft() == null) {
            return sum == node.getValue();
        }
        //
        sum -= node.getValue();
        return pathExists(node.getLeft(), sum) || pathExists(node.getRight(), sum);
    }
}