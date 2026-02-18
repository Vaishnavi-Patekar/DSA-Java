import java.util.*;

public class SumOfElemets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
            sumOfArray(arr);
        System.out.println("SUM =" + sumOfArray(arr));

    }

    static int sumOfArray(int[] arr){
        int sum = 0;

        for(int i =0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
}
