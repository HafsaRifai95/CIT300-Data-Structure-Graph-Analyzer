
public class LinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // Insert a value at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
        System.out.println(data + " inserted successfully.");
    }

    // Delete the first node containing the given value
    public boolean delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return false;
        }

        if (head.data == data) {
            head = head.next;
            size--;
            System.out.println(data + " deleted successfully.");
            return true;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;
                System.out.println(data + " deleted successfully.");
                return true;
            }

            current = current.next;
        }

        System.out.println(data + " not found.");
        return false;
    }

    // Search for a value
    public boolean search(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                System.out.println(data + " found in the list.");
                return true;
            }

            current = current.next;
        }

        System.out.println(data + " not found in the list.");
        return false;
    }

    // Display all values
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;

        System.out.print("Linked List: ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Return the number of nodes
    public int getSize() {
        return size;
    }

    // Check whether the list is empty
    public boolean isEmpty() {
        return head == null;
    }
}
