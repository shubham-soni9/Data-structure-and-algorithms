import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreePrograms {

    public static <T> void traverseDFS(BinaryTree<T> root) {
        if (root == null) return;
        Stack<BinaryTree<T>> stack = new Stack<>();
        stack.push(root);

        System.out.println("Depth First Search");
        while (!stack.isEmpty()) {
            BinaryTree<T> item = stack.pop();
            System.out.print("->" + item.data);

            if (item.right != null) {
                stack.push(item.right);
            }
            if (item.left != null) {
                stack.push(item.left);
            }
        }
    }

    public static <T> void traverseDFSRecursive(BinaryTree<T> root) {
        if (root == null) return;

        System.out.print("->" + root.data);
        traverseDFSRecursive(root.left);
        traverseDFSRecursive(root.right);
    }

    public static <T> void traverseBFS(BinaryTree<T> node) {
        if (node == null) return;

        Queue<BinaryTree<T>> queue = new ArrayDeque<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            BinaryTree<T> item = queue.poll();
            System.out.print("->" + item.data);

            if (item.left != null) queue.offer(item.left);
            if (item.right != null) queue.offer(item.right);
        }
    }

    public static <T> boolean isNodeExists(BinaryTree<T> node, T key) {
        if (node == null) return false;
        if (node.data == key) return true;

        return isNodeExists(node.left, key) || isNodeExists(node.right, key);
    }

    public static <T> int treeSum(BinaryTree<T> node) {
        if (node == null) return 0;
        return treeSum(node.left) + treeSum(node.right) + (Integer) node.data;
    }

    public static <T> int treeMinimum(BinaryTree<T> node) {
        if (node == null) return Integer.MAX_VALUE;

        return Math.min((Integer) node.data, Math.min(treeMinimum(node.left), treeMinimum(node.right)));
    }

    public static <T> int maximumPathToLeaf(BinaryTree<T> node) {
        if (node == null) return 0;
        return (Integer) node.data + Math.max(maximumPathToLeaf(node.left), maximumPathToLeaf(node.right));
    }
}
