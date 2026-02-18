import java.util.*;

public class file1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }  
    System.out.println("Sum of Elements="+sum);
}
  
}