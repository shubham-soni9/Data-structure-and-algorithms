import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class GraphPrograms {

    public static <T> void traverseDFS(MyGraph<T> graph, T source) {
        System.out.print("Traversing DFS Graph Iterative:");
        Stack<T> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()) {
            T item = stack.pop();
            System.out.print("->" + item);

            for (T child : graph.getEdges(item)) {
                stack.push(child);
            }
        }
    }

    public static <T> void traverseDFSRecursive(MyGraph<T> graph, T source) {
        System.out.print("->" + source);

        for (T item : graph.getEdges(source)) {
            traverseDFSRecursive(graph, item);
        }
    }

    public static <T> void traverseBFS(MyGraph<T> graph, T source) {
        System.out.print("\nTraversing Graph BFS");
        Queue<T> queue = new ArrayDeque<>();
        queue.offer(source);

        while (!queue.isEmpty()) {
            T item = queue.poll();
            System.out.print("->" + item);

            for (T child : graph.getEdges(item)) {
                queue.offer(child);
            }
        }
    }

    public static <T> boolean hasPathIterative(MyGraph<T> graph, T source, T dest) {
        Stack<T> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()) {
            T item = stack.pop();
            if (item == dest) {
                return true;
            }

            for (T child : graph.getEdges(item)) {
                stack.push(child);
            }
        }
        return false;
    }

    public static <T> boolean hasPathRecursive(MyGraph<T> graph, T source, T dest) {
        if (source == dest) return true;

        for (T child : graph.getEdges(source)) {
            boolean result = hasPathRecursive(graph, child, dest);
            if (result) {
                return true;
            }
        }

        return false;
    }
}
