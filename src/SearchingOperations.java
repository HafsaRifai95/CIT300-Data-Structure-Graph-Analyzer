import java.util.Arrays;

public class SearchingOperations {

    // Linear search
    public int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Binary search (array must be sorted)
    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

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

    // Compare search performance
    public void compareSearch(int[] values, int target) {

        if (values.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Measure linear search
        int linearSteps = 0;
        int linearResult = -1;

        long startLinear = System.nanoTime();

        for (int i = 0; i < values.length; i++) {
            linearSteps++;

            if (values[i] == target) {
                linearResult = i;
                break;
            }
        }

        long linearTime = System.nanoTime() - startLinear;

        // Sort a copy for binary search
        int[] sorted = Arrays.copyOf(values, values.length);
        Arrays.sort(sorted);

        int binarySteps = 0;
        int binaryResult = -1;

        long startBinary = System.nanoTime();

        int left = 0;
        int right = sorted.length - 1;

        while (left <= right) {
            binarySteps++;

            int middle = left + (right - left) / 2;

            if (sorted[middle] == target) {
                binaryResult = middle;
                break;
            } else if (sorted[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        long binaryTime = System.nanoTime() - startBinary;

        // Display results
        System.out.println("\n===== PERFORMANCE COMPARISON =====");

        System.out.println("\nLinear Search");
        System.out.println("Result: " +
                (linearResult >= 0 ? "Found" : "Not found"));
        System.out.println("Index in original array: " + linearResult);
        System.out.println("Steps: " + linearSteps);
        System.out.println("Time: " + linearTime + " ns");

        System.out.println("\nBinary Search");
        System.out.println("Result: " +
                (binaryResult >= 0 ? "Found" : "Not found"));
        System.out.println("Index in sorted array: " + binaryResult);
        System.out.println("Steps: " + binarySteps);
        System.out.println("Time: " + binaryTime + " ns");

        System.out.println("\nTime Complexity:");
        System.out.println("Linear Search: O(n)");
        System.out.println("Binary Search: O(log n)");
    }
}