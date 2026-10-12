public class ArrayOperations {

    private int[] array;
    private int size;

    public ArrayOperations(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // Insert an element
    public void insert(int value) {
        if (size == array.length) {
            System.out.println("Array is full!");
            return;
        }

        array[size] = value;
        size++;

        System.out.println("Element inserted successfully.");
    }

    // Delete an element by index
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        System.out.println("Element deleted successfully.");
    }

    // Display array elements
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("Array elements:");

        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }

    // Linear search
    public int linearSearch(int target) {
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Get array elements for performance comparison
    public int[] getValues() {
        int[] values = new int[size];

        for (int i = 0; i < size; i++) {
            values[i] = array[i];
        }

        return values;
    }

    public int getSize() {
        return size;
    }
}