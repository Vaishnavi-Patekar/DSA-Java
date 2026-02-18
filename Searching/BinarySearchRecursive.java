public class BinarySearchRecursive {

    static int binarySearchRec(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == key)
            return mid;
        else if (arr[mid] < key)
            return binarySearchRec(arr, mid + 1, high, key);
        else
            return binarySearchRec(arr, low, mid - 1, key);
    }
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6};
        int key = 3;

        System.out.println(" Index : "+binarySearchRec(arr, 0, arr.length-1, key));
    }
}
