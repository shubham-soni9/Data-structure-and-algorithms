
public class Main {
    public static void main(String[] args) {
        MyGraph<Character> firstGraph = createGraph();
        GraphPrograms.traverseDFS(firstGraph, 'F');

        System.out.print("\nTraversing Graph Recursive:");
        GraphPrograms.traverseDFSRecursive(firstGraph, 'F');

        GraphPrograms.traverseBFS(firstGraph, 'F');

        boolean isPath = GraphPrograms.hasPathIterative(firstGraph, 'F', 'K');
        System.out.println("\nPath Available: " + isPath);

        isPath = GraphPrograms.hasPathRecursive(firstGraph, 'F', 'K');
        System.out.println("Path Available: " + isPath);
    }

    private static MyGraph<Character> createGraph() {
        MyGraph<Character> myGraph = new MyGraph<>();
        myGraph.addEdge('F', 'G');
        myGraph.addEdge('F', 'I');
        myGraph.addEdge('G', 'H');
        myGraph.addEdge('I', 'K');
        myGraph.addEdge('I', 'G');
        myGraph.addEdge('J', 'I');
        return myGraph;
    }


    private static void textNumberTree() {
        BinaryTree<Integer> numberRoot = createNumberTree();
        int treeSum = BinaryTreePrograms.treeSum(numberRoot);
        System.out.println("Sum of nodes of a tree is " + treeSum);

        int treeMin = BinaryTreePrograms.treeMinimum(numberRoot);
        System.out.println("Minimum of nodes of a tree is " + treeMin);

        int maxPathToLeft = BinaryTreePrograms.maximumPathToLeaf(numberRoot);
        System.out.println("Maximum path to left from root is " + maxPathToLeft);
    }

    private static void testCharacterTree() {
        BinaryTree<Character> root = createTree();
        BinaryTreePrograms.traverseDFS(root);

        System.out.println("\nTraverse DFS Recursive");
        BinaryTreePrograms.traverseDFSRecursive(root);

        System.out.println("\nTraverse BFS Iterative");
        BinaryTreePrograms.traverseBFS(root);
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

    private static BinaryTree<Integer> createNumberTree() {
        BinaryTree<Integer> root = new BinaryTree<>(5);
        BinaryTree<Integer> nodeB = new BinaryTree<>(11);
        BinaryTree<Integer> nodeC = new BinaryTree<>(3);
        BinaryTree<Integer> nodeD = new BinaryTree<>(4);
        BinaryTree<Integer> nodeE = new BinaryTree<>(2);
        BinaryTree<Integer> nodeF = new BinaryTree<>(1);

        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeC.right = nodeF;
        root.left = nodeB;
        root.right = nodeC;
        return root;
    }

}