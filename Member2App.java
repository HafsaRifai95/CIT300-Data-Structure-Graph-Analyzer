import java.util.NoSuchElementException;
import java.util.Scanner;

public class Member2App {

    private static final Scanner input = new Scanner(System.in);
    private static final Stack<String> stack = new Stack<>();
    private static final Queue<String> queue = new Queue<>();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n================================");
            System.out.println("   MEMBER 2: STACK & QUEUE");
            System.out.println("================================");
            System.out.println("1. Stack Operations");
            System.out.println("2. Queue Operations");
            System.out.println("3. Display Summary");
            System.out.println("4. Exit");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1 -> stackMenu();
                case 2 -> queueMenu();
                case 3 -> showSummary();
                case 4 -> {
                    running = false;
                    System.out.println("Program closed.");
                }
                default -> System.out.println(
                    "Invalid choice. Enter 1, 2, 3 or 4."
                );
            }
        }

        input.close();
    }

    private static void stackMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Size");
            System.out.println("6. Return");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1 -> {
                    String item = readItem("Enter item: ");
                    stack.push(item);
                }
                case 2 -> {
                    try {
                        System.out.println("Popped: " + stack.pop());
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        System.out.println("Top: " + stack.peek());
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> stack.display();
                case 5 -> System.out.println(
                    "Stack size: " + stack.size()
                );
                case 6 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void queueMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n--- QUEUE MENU ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek / Front");
            System.out.println("4. Display");
            System.out.println("5. Size");
            System.out.println("6. Return");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1 -> {
                    String item = readItem("Enter item: ");
                    queue.enqueue(item);
                }
                case 2 -> {
                    try {
                        System.out.println("Dequeued: " + queue.dequeue());
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        System.out.println("Front: " + queue.peek());
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> queue.display();
                case 5 -> System.out.println(
                    "Queue size: " + queue.size()
                );
                case 6 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void showSummary() {
        System.out.println("\n--- SUMMARY ---");
        System.out.println("Stack size: " + stack.size());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Stack empty: " + stack.isEmpty());
        System.out.println("Queue empty: " + queue.isEmpty());
    }

    private static String readItem(String message) {
        while (true) {
            System.out.print(message);
            String item = input.nextLine().trim();

            if (!item.isEmpty()) {
                return item;
            }

            System.out.println("Please enter a non-empty item.");
        }
    }

    private static int readInt(String message) {
        while (true) {
            System.out.print(message);
            String value = input.nextLine().trim();

            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                System.out.println(
                    "Invalid input. Please enter a whole number."
                );
            }
        }
    }
}