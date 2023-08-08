public class BinaryTree<T> {

    T data;
    BinaryTree<T> left;
    BinaryTree<T> right;

    public BinaryTree(T data) {
        this.data = data;
    }

    public BinaryTree(T data, BinaryTree<T> left, BinaryTree<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
