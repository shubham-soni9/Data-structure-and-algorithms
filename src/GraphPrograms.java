import java.util.*;

public class GraphPrograms<T> {

    public static <T> void traverseDFS(MyGraph<T> graph, T source) {
        System.out.print("Traversing DFS Graph Iterative:");
        Stack<T> stack = new Stack<>();
        stack.push(source);

        HashSet<T> visited = new HashSet<>();

        while (!stack.isEmpty()) {
            T item = stack.pop();
            visited.add(item);
            System.out.print("->" + item);

            for (T child : graph.getEdges(item)) {
                if (!visited.contains(item)) {
                    stack.push(child);
                }
            }
        }
    }

    public static <T> void traverseDFSRecursive(MyGraph<T> graph, T source, HashSet<T> visited) {
        if (visited.contains(source)) return;
        System.out.print("->" + source);
        visited.add(source);
        for (T item : graph.getEdges(source)) {
            traverseDFSRecursive(graph, item, visited);
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

    public static <T> int connectedComponentGraph(MyGraph<T> graph) {
        HashSet<T> visited = new HashSet<>();
        int count = 0;
        for (Map.Entry<T, Set<T>> entry : graph.getEntrySet()) {
            if (!visited.contains(entry.getKey())) {
                count++;
                Stack<T> stack = new Stack<>();
                stack.push(entry.getKey());

                while (!stack.isEmpty()) {
                    T item = stack.pop();
                    visited.add(item);

                    for (T child : graph.getEdges(item)) {
                        if (!visited.contains(child)) {
                            stack.push(child);
                        }
                    }
                }
            }
        }
        return count;
    }

    public static <T> int maxComponentGraph(MyGraph<T> graph) {
        HashSet<T> visited = new HashSet<>();
        int maxCount = 0;
        int currentCount = 0;
        for (Map.Entry<T, Set<T>> entry : graph.getEntrySet()) {
            if (!visited.contains(entry.getKey())) {
                Stack<T> stack = new Stack<>();
                stack.push(entry.getKey());

                while (!stack.isEmpty()) {
                    T item = stack.pop();
                    visited.add(item);
                    currentCount++;
                    for (T child : graph.getEdges(item)) {
                        if (!visited.contains(child)) {
                            stack.push(child);
                        }
                    }
                }
            }
            maxCount = Math.max(maxCount, currentCount);
            currentCount = 0;
        }
        return maxCount;
    }

    static class Node<T> {
        T data;
        int count;

        public Node(T data, int count) {
            this.data = data;
            this.count = count;
        }
    }

    public static <T> int getShortestPath(MyGraph<T> graph, T source, T destination) {
        HashSet<T> visited = new HashSet<>();
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.offer(new Node<>(source, 0));

        while (!queue.isEmpty()) {
            Node<T> item = queue.poll();
            visited.add(item.data);

            if (item.data == destination) {
                return item.count;
            }

            for (T child : graph.getEdges(item.data)) {
                if (!visited.contains(child)) {
                    queue.offer(new Node<>(child, item.count + 1));
                }
            }
        }

        return 0;
    }

    private static HashSet<String> visited;

    public static <T> int islandCountProblem(Character[][] grid) {
        visited = new HashSet<>();
        int islandCount = 0;
        int row = grid.length;
        int column = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                String key = i + "," + j;
                if (grid[i][j] == 'L') {
                    if (!visited.contains(key)) {
                        islandDFS(grid, i, j, row, column);
                        islandCount++;
                    }
                }
            }
        }

        return islandCount;
    }

    private static <T> void islandDFS(Character[][] grid, int i, int j, int row, int column) {
        if (i < 0 || j < 0) return;
        if (i >= row || j >= column) return;
        if(grid[i][j] == 'W') return;
        String key = i + "," + j;
        if(visited.contains(key)) return;
        visited.add(key);

        islandDFS(grid, i + 1, j, row, column);
        islandDFS(grid, i - 1, j, row, column);
        islandDFS(grid, i, j + 1, row, column);
        islandDFS(grid, i, j - 1, row, column);
    }
}
