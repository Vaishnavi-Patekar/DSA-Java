public class file3 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2; // index to delete (30)

        int size = arr.length;  // logical size

        // Shift elements to the left
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--; // reduce logical size after deletion

        // Print array using logical size
        System.out.print("Array after deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
