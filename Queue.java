import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/**
 * Queue for the CIT300 Data Structure Analyzer.
 * FIFO: First In, First Out.
 */
public class Queue<T> {

    private final ArrayDeque<T> elements;

    public Queue() {
        elements = new ArrayDeque<>();
    }

    public void enqueue(T item) {
        if (item == null) {
            throw new IllegalArgumentException(
                "Null values are not allowed."
            );
        }

        elements.addLast(item);
        System.out.println("Item enqueued successfully.");
    }

    public T dequeue() {
        ensureNotEmpty();
        return elements.removeFirst();
    }

    public T peek() {
        ensureNotEmpty();
        return elements.getFirst();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue (front to back): " + elements);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public void clear() {
        elements.clear();
    }

    private void ensureNotEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException(
                "Cannot perform operation: queue is empty."
            );
        }
    }
}