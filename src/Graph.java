
import java.util.*;

public class Graph {

    private final Map<String, List<String>> adjacencyList;

    // Constructor
    public Graph() {
        adjacencyList = new LinkedHashMap<>();
    }

    // Add a vertex
    public boolean addVertex(String vertex) {
        if (vertex == null || vertex.trim().isEmpty()) {
            System.out.println("Vertex name cannot be empty.");
            return false;
        }

        vertex = vertex.trim();

        if (adjacencyList.containsKey(vertex)) {
            System.out.println("Vertex already exists: " + vertex);
            return false;
        }

        adjacencyList.put(vertex, new ArrayList<>());
        System.out.println("Vertex added: " + vertex);
        return true;
    }

    // Add an undirected edge
    public boolean addEdge(String source, String destination) {
        if (source == null || destination == null) {
            System.out.println("Vertex names cannot be null.");
            return false;
        }

        source = source.trim();
        destination = destination.trim();

        if (!adjacencyList.containsKey(source)
                || !adjacencyList.containsKey(destination)) {
            System.out.println("Both vertices must exist first.");
            return false;
        }

        if (source.equals(destination)) {
            System.out.println("A vertex cannot connect to itself.");
            return false;
        }

        if (adjacencyList.get(source).contains(destination)) {
            System.out.println("Edge already exists.");
            return false;
        }

        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);

        System.out.println("Edge added: " + source + " - " + destination);
        return true;
    }

    // Display graph connections
    public void displayGraph() {
        if (adjacencyList.isEmpty()) {
            System.out.println("The graph is empty.");
            return;
        }

        System.out.println("\n--- Graph Connections ---");

        for (Map.Entry<String, List<String>> entry
                : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Search for a vertex
    public boolean searchVertex(String vertex) {
        if (vertex == null) {
            return false;
        }

        vertex = vertex.trim();
        boolean found = adjacencyList.containsKey(vertex);

        System.out.println(found
                ? "Vertex found: " + vertex
                : "Vertex not found: " + vertex);

        return found;
    }

    // Breadth-First Search (BFS)
    public List<String> bfs(String startVertex) {
        List<String> result = new ArrayList<>();

        if (startVertex == null
                || !adjacencyList.containsKey(startVertex.trim())) {
            System.out.println("Starting vertex does not exist.");
            return result;
        }

        // Use Java's built-in Queue and LinkedList to avoid class conflicts.
        java.util.Queue<String> queue = new java.util.LinkedList<>();
        Set<String> visited = new LinkedHashSet<>();

        String start = startVertex.trim();
        visited.add(start);
        queue.offer(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            result.add(current);

            for (String neighbour : adjacencyList.get(current)) {
                if (visited.add(neighbour)) {
                    queue.offer(neighbour);
                }
            }
        }

        System.out.println("BFS Traversal: " + result);
        return result;
    }

    // Depth-First Search (DFS)
    public List<String> dfs(String startVertex) {
        List<String> result = new ArrayList<>();

        if (startVertex == null
                || !adjacencyList.containsKey(startVertex.trim())) {
            System.out.println("Starting vertex does not exist.");
            return result;
        }

        Set<String> visited = new LinkedHashSet<>();
        dfsHelper(startVertex.trim(), visited, result);

        System.out.println("DFS Traversal: " + result);
        return result;
    }

    // Recursive DFS helper
    private void dfsHelper(String vertex, Set<String> visited,
            List<String> result) {
        visited.add(vertex);
        result.add(vertex);

        for (String neighbour : adjacencyList.get(vertex)) {
            if (!visited.contains(neighbour)) {
                dfsHelper(neighbour, visited, result);
            }
        }
    }

    // Count vertices
    public int getVertexCount() {
        return adjacencyList.size();
    }

    // Count undirected edges
    public int getEdgeCount() {
        int count = 0;

        for (List<String> neighbours : adjacencyList.values()) {
            count += neighbours.size();
        }

        return count / 2;
    }

    // Check if graph is empty
    public boolean isEmpty() {
        return adjacencyList.isEmpty();
    }

    // Compare BFS and DFS execution times
    public void compareTraversalPerformance(String startVertex) {
        if (startVertex == null
                || !adjacencyList.containsKey(startVertex.trim())) {
            System.out.println("Starting vertex does not exist.");
            return;
        }

        String start = startVertex.trim();

        long bfsStart = System.nanoTime();
        bfs(start);
        long bfsTime = System.nanoTime() - bfsStart;

        long dfsStart = System.nanoTime();
        dfs(start);
        long dfsTime = System.nanoTime() - dfsStart;

        System.out.println("\n--- Performance Comparison ---");
        System.out.println("BFS time: " + bfsTime + " nanoseconds");
        System.out.println("DFS time: " + dfsTime + " nanoseconds");
        System.out.println("Note: Times may vary between runs.");
    }
}
