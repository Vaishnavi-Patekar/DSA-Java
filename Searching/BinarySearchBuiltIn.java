import java.util.Arrays;

public class BinarySearchBuiltIn{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int key = 3;

         //  Built-in Binary Search
        int index3 = Arrays.binarySearch(arr, key);
        System.out.println("Built-in Binary Search Index: " + index3);
    }
}