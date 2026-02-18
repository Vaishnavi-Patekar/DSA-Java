import java.util.*;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter value of aray one by one :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("larget element = "+ max(arr));
    }

    static int max(int[] arr){
       int maxVal = arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]>maxVal){
            maxVal=arr[i];
           }
           
       }
       return maxVal;
    }
    
}
