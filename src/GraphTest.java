
public class GraphTest {

    public static void main(String[] args) {

        Graph graph = new Graph();

        System.out.println("===== GRAPH COMPONENT TEST =====");

        // Add vertices
        System.out.println("\n--- Adding Vertices ---");
        graph.addVertex("Library");
        graph.addVertex("Cafeteria");
        graph.addVertex("Lab");
        graph.addVertex("Main Hall");

        // Add edges
        System.out.println("\n--- Adding Edges ---");
        graph.addEdge("Library", "Cafeteria");
        graph.addEdge("Library", "Lab");
        graph.addEdge("Cafeteria", "Main Hall");
        graph.addEdge("Lab", "Main Hall");

        // Display graph
        System.out.println("\n--- Display Graph ---");
        graph.displayGraph();

        // Search vertices
        System.out.println("\n--- Search Vertices ---");
        graph.searchVertex("Library");
        graph.searchVertex("Auditorium");

        // BFS traversal
        System.out.println("\n--- BFS Traversal ---");
        graph.bfs("Library");

        // DFS traversal
        System.out.println("\n--- DFS Traversal ---");
        graph.dfs("Library");

        // Graph statistics
        System.out.println("\n--- Graph Statistics ---");
        System.out.println("Total vertices: " + graph.getVertexCount());
        System.out.println("Total edges: " + graph.getEdgeCount());
        System.out.println("Is graph empty? " + graph.isEmpty());

        // Compare performance
        System.out.println("\n--- Performance Comparison ---");
        graph.compareTraversalPerformance("Library");

        System.out.println("\n===== TEST COMPLETED =====");
    }
}
