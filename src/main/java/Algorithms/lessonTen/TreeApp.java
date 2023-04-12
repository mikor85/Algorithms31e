package Algorithms.lessonTen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeApp {
    // Breadth First Search
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
        //TreeNode l2 = new TreeNode(6);
        TreeNode r2 = new TreeNode(7);
        //right.setLeft(l2);
        right.setRight(r2);

        TreeApp treeApp = new TreeApp();
        treeApp.traverseTree(root);
        treeApp.traverseTreeReverse(root);
    }

    private void traverseTree(TreeNode root) {
        // 1. Check corner case
        if (root == null) {
            return;
        }
        // 2. Create Queue
        Queue<TreeNode> queue = new LinkedList<>();
        // 3. Add root to Queue
        queue.offer(root);
        while (!queue.isEmpty()) {   // Level iteration
            int size = queue.size();   // Size of current level
            for (int i = 0; i < size; i++) {   // Element iteration
                TreeNode node = queue.poll();
                System.out.print(node.getValue() + " ");
                // Add left node to Queue
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }
                // Add right node to Queue
                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
            System.out.println();
        }
    }


    private void traverseTreeReverse(TreeNode root) {
        if (root == null) {
            return;
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.getValue());
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
            result.add(0, levelList);
        }
        for (List<Integer> list : result) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
