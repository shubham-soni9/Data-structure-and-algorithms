
public class Main {
    public static void main(String[] args) {
        BinaryTree<Character> root = createTree();
    }

    private static BinaryTree<Character> createTree() {
        BinaryTree<Character> root = new BinaryTree<>('A');
        BinaryTree<Character> nodeB = new BinaryTree<>('B');
        BinaryTree<Character> nodeC = new BinaryTree<>('C');
        BinaryTree<Character> nodeD = new BinaryTree<>('D');
        BinaryTree<Character> nodeE = new BinaryTree<>('E');
        BinaryTree<Character> nodeF = new BinaryTree<>('F');

        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeC.right = nodeF;
        root.left = nodeB;
        root.right = nodeC;
        return root;
    }
}