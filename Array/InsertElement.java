import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int element = 99;
        int index = 2;

        // Create new array with one extra size
        int[] newArr = new int[arr.length + 1];

        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // Insert element
        newArr[index] = element;

        // Copy remaining elements
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print result
        System.out.println("Array after insertion: " + Arrays.toString(newArr));
    }
}
