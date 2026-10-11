
import java.util.Arrays;

public class ArrayOperations {

    private int[] array;
    private int size;

    public ArrayOperations(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // Add a value to the end of the array
    public boolean insert(int value) {
        if (size >= array.length) {
            System.out.println("Array is full!");
            return false;
        }

        array[size] = value;
        size++;
        return true;
    }

    // Display all array values
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("Array: " +
                Arrays.toString(Arrays.copyOf(array, size)));
    }

    // Delete a value at a given index
    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return true;
    }

    // Search for a value using linear search
    public int linearSearch(int target) {
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Sort the array and search using binary search
    public int binarySearch(int target) {
        Arrays.sort(array, 0, size);

        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    // Return the current number of values
    public int getSize() {
        return size;
    }

    // Return the array values
    public int[] getValues() {
        return Arrays.copyOf(array, size);
    }
}
