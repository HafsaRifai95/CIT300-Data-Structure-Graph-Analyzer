import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Stack for the CIT300 Data Structure Analyzer.
 * LIFO: Last In, First Out.
 */
public class Stack<T> {

    private final List<T> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(T item) {
        if (item == null) {
            throw new IllegalArgumentException(
                "Null values are not allowed."
            );
        }

        elements.add(item);
        System.out.println("Item pushed successfully.");
    }

    public T pop() {
        ensureNotEmpty();
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        ensureNotEmpty();
        return elements.get(elements.size() - 1);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack (top to bottom):");

        for (int i = elements.size() - 1; i >= 0; i--) {
            System.out.println("| " + elements.get(i) + " |");
        }
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
                "Cannot perform operation: stack is empty."
            );
        }
    }
}