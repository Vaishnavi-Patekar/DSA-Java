import java.util.Scanner;

public class FindMissingNo {

    public int findMissingNumber(int[] arr, int N) {
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // Array size will be N-1 because one number is missing
        int[] arr = new int[N - 1];

        System.out.println("Enter array elements:");
        for (int i = 0; i < N - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // 🔹 Create object of Solution class
        FindMissingNo obj = new FindMissingNo();

        // 🔹 Call the method using object
        int missing = obj.findMissingNumber(arr, N);

        System.out.println("Missing number is: " + missing);
    }
}
