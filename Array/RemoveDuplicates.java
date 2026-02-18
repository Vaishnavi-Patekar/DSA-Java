import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements of array (sorted):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = duplicates(arr);
        System.out.println("New length after removing duplicates: " + result);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int duplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }
}
