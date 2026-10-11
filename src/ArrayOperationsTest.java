
public class ArrayOperationsTest {

    public static void main(String[] args) {

        ArrayOperations operations = new ArrayOperations(5);

        System.out.println("=== Array Operations Test ===");

        // Test insertion
        operations.insert(10);
        operations.insert(20);
        operations.insert(30);

        System.out.println("\nAfter inserting values:");
        operations.display();

        // Test linear search
        System.out.println("\nLinear search for 20:");
        int index = operations.linearSearch(20);

        if (index != -1) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found.");
        }

        // Test deletion
        System.out.println("\nDeleting the value at index 1:");
        operations.delete(1);
        operations.display();

        // Test array size
        System.out.println("\nCurrent array size: "
                + operations.getSize());

        // Test binary search
        System.out.println("\nBinary search for 30:");
        int binaryIndex = operations.binarySearch(30);

        if (binaryIndex != -1) {
            System.out.println("Value found at index: "
                    + binaryIndex);
        } else {
            System.out.println("Value not found.");
        }

        System.out.println("\nArray after binary search:");
        operations.display();

        System.out.println("\n=== Test Completed ===");
    }
}
