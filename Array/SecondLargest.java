import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];

         if (size < 2) {
            System.out.println("Second largest element does not exist.");
            return;
        }

        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
       int result = findsecondlargest(arr);
        System.out.println("secondlargest = " + result);
    }

    static int findsecondlargest(int[] arr){

        
        // int largest = Integer.MIN_VALUE;
        // int secondlarge = Integer.MIN_VALUE;
         int largest = arr[0];
        int secondlarge = arr[1];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                 secondlarge = largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlarge && arr[i]!=largest){
                secondlarge=arr[i];
            }
        }

        return secondlarge;

    }
}
