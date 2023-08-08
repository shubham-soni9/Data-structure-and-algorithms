import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyGraph<T> {
    private final Map<T, Set<T>> verticesMap;

    public MyGraph() {
        verticesMap = new HashMap<>();
    }

    public boolean hasVertex(T v) {
        return verticesMap.containsKey(v);
    }

    public void addVertex(T v) {
        verticesMap.put(v, new HashSet<>());
    }

    public void addEdge(T v, T w) {
        if (!hasVertex(v)) addVertex(v);
        if (!hasVertex(w)) addVertex(w);
        verticesMap.get(v).add(w);
        verticesMap.get(w).add(v);
    }
}
