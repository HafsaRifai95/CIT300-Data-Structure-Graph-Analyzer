import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final ArrayOperations array = new ArrayOperations(100);
    private static final Stack<Integer> stack = new Stack<>();
    private static final Queue<Integer> queue = new Queue<>();
    private static final LinkedList list = new LinkedList();
    private static final SearchingOperations searching =
            new SearchingOperations();
    private static final Graph graph = new Graph();

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" DATA STRUCTURE & GRAPH PERFORMANCE ANALYZER");
        System.out.println("==============================================");

        int choice;

        do {
            displayMainMenu();
            choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    arrayMenu();
                    break;
                case 2:
                    stackMenu();
                    break;
                case 3:
                    queueMenu();
                    break;
                case 4:
                    linkedListMenu();
                    break;
                case 5:
                    searchingMenu();
                    break;
                case 6:
                    graphMenu();
                    break;
                case 7:
                    performanceMenu();
                    break;
                case 8:
                    displayAllResults();
                    break;
                case 9:
                    System.out.println("Program closed. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Enter 1-9.");
            }

        } while (choice != 9);
    }

    private static void displayMainMenu() {
        System.out.println("\n============= MAIN MENU =============");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }

            System.out.println("Invalid input. Please enter a number.");

            if (scanner.hasNext()) {
                scanner.next();
            } else {
                return 9;
            }
        }
    }

    private static String readText(String prompt) {
        System.out.print(prompt);
        return scanner.next().trim();
    }

    // ================= ARRAY =================

    private static void arrayMenu() {
        int choice;

        do {
            System.out.println("\n========= ARRAY OPERATIONS =========");
            System.out.println("1. Insert");
            System.out.println("2. Delete by index");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("0. Return to Main Menu");

            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    array.insert(readInt("Enter value: "));
                    break;

                case 2:
                    array.delete(readInt("Enter index to delete: "));
                    break;

                case 3:
                    int target = readInt("Enter value to search: ");
                    int index = array.linearSearch(target);

                    System.out.println(index >= 0
                            ? "Value found at index " + index
                            : "Value not found.");
                    break;

                case 4:
                    array.display();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    // ================= STACK =================

    private static void stackMenu() {
        int choice;

        do {
            System.out.println("\n========= STACK OPERATIONS =========");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("0. Return to Main Menu");

            choice = readInt("Enter choice: ");

            try {
                switch (choice) {
                    case 1:
                        stack.push(readInt("Enter value: "));
                        break;

                    case 2:
                        System.out.println("Popped: " + stack.pop());
                        break;

                    case 3:
                        System.out.println("Top element: " + stack.peek());
                        break;

                    case 4:
                        stack.display();
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);
    }

    // ================= QUEUE =================

    private static void queueMenu() {
        int choice;

        do {
            System.out.println("\n========= QUEUE OPERATIONS =========");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek / Front");
            System.out.println("4. Display");
            System.out.println("0. Return to Main Menu");

            choice = readInt("Enter choice: ");

            try {
                switch (choice) {
                    case 1:
                        queue.enqueue(readInt("Enter value: "));
                        break;

                    case 2:
                        System.out.println("Dequeued: " + queue.dequeue());
                        break;

                    case 3:
                        System.out.println("Front element: " + queue.peek());
                        break;

                    case 4:
                        queue.display();
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (NoSuchElementException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 0);
    }

    // ================= LINKED LIST =================

    private static void linkedListMenu() {
        int choice;

        do {
            System.out.println("\n======= LINKED LIST OPERATIONS =======");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Display Size");
            System.out.println("0. Return to Main Menu");

            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    list.insert(readInt("Enter value: "));
                    break;

                case 2:
                    list.delete(readInt("Enter value to delete: "));
                    break;

                case 3:
                    list.search(readInt("Enter value to search: "));
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    System.out.println("List size: " + list.getSize());
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    // ================= SEARCHING =================

    private static void searchingMenu() {
        int choice;

        do {
            System.out.println("\n======= SEARCHING OPERATIONS =======");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Compare Search Performance");
            System.out.println("0. Return to Main Menu");

            choice = readInt("Enter choice: ");

            int[] values = array.getValues();

            switch (choice) {
                case 1: {
                    if (values.length == 0) {
                        System.out.println("Array is empty.");
                        break;
                    }

                    int target = readInt("Enter value to search: ");
                    int result = searching.linearSearch(values, target);

                    System.out.println(result >= 0
                            ? "Value found at index " + result
                            : "Value not found.");
                    break;
                }

                case 2: {
                    if (values.length == 0) {
                        System.out.println("Array is empty.");
                        break;
                    }

                    int target = readInt("Enter value to search: ");
                    int[] sorted = Arrays.copyOf(values, values.length);
                    Arrays.sort(sorted);

                    int result = searching.binarySearch(sorted, target);

                    System.out.println("Sorted array: "
                            + Arrays.toString(sorted));
                    System.out.println(result >= 0
                            ? "Value found at sorted index " + result
                            : "Value not found.");
                    break;
                }

                case 3: {
                    if (values.length == 0) {
                        System.out.println("Array is empty.");
                        break;
                    }

                    int target = readInt("Enter value to search: ");
                    searching.compareSearch(values, target);
                    break;
                }

                case 0:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    // ================= GRAPH =================

    private static void graphMenu() {
        int choice;

        do {
            System.out.println("\n========== GRAPH OPERATIONS ==========");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. Search Vertex");
            System.out.println("5. BFS Traversal");
            System.out.println("6. DFS Traversal");
            System.out.println("7. Graph Statistics");
            System.out.println("8. Compare BFS and DFS Performance");
            System.out.println("0. Return to Main Menu");

            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    graph.addVertex(readText("Enter vertex name: "));
                    break;

                case 2: {
                    String source = readText("Enter source vertex: ");
                    String destination =
                            readText("Enter destination vertex: ");
                    graph.addEdge(source, destination);
                    break;
                }

                case 3:
                    graph.displayGraph();
                    break;

                case 4:
                    graph.searchVertex(readText("Enter vertex to search: "));
                    break;

                case 5:
                    graph.bfs(readText("Enter starting vertex: "));
                    break;

                case 6:
                    graph.dfs(readText("Enter starting vertex: "));
                    break;

                case 7:
                    System.out.println("Vertices: " + graph.getVertexCount());
                    System.out.println("Edges: " + graph.getEdgeCount());
                    System.out.println("Graph empty: " + graph.isEmpty());
                    break;

                case 8:
                    graph.compareTraversalPerformance(
                            readText("Enter starting vertex: "));
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    // ================= PERFORMANCE =================

    private static void performanceMenu() {
        System.out.println("\n======= PERFORMANCE COMPARISON =======");

        int[] values = array.getValues();

        if (values.length == 0) {
            System.out.println(
                    "Insert some array values before comparing searches.");
        } else {
            int target = readInt("Enter value to search: ");
            searching.compareSearch(values, target);
        }

        if (graph.isEmpty()) {
            System.out.println(
                    "Add graph vertices and edges to compare BFS and DFS.");
        } else {
            graph.compareTraversalPerformance(
                    readText("Enter graph starting vertex: "));
        }

        System.out.println("\nComplexity Summary:");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n) after sorting");
        System.out.println("BFS: O(V + E) with an adjacency list");
        System.out.println("DFS: O(V + E) with an adjacency list");
        System.out.println("V = vertices; E = edges.");
    }

    // ================= DISPLAY ALL RESULTS =================

    private static void displayAllResults() {
        System.out.println("\n========= CURRENT RESULTS =========");

        System.out.println("\n--- Array ---");
        array.display();

        System.out.println("\n--- Stack ---");
        stack.display();

        System.out.println("\n--- Queue ---");
        queue.display();

        System.out.println("\n--- Linked List ---");
        list.display();
        System.out.println("Linked List size: " + list.getSize());

        System.out.println("\n--- Graph ---");
        graph.displayGraph();
        System.out.println("Vertices: " + graph.getVertexCount());
        System.out.println("Edges: " + graph.getEdgeCount());
    }
}