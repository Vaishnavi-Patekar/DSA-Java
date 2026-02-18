import java.util.Scanner;

import javax.swing.SortOrder;

public class CountOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements of array :");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Element : ");

        int target = sc.nextInt();

        int result = countOcc(arr, target);
        System.out.println("Occurence = " + result);
    }

    static int countOcc(int[] arr , int target){

        int counter = 0;
        

        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                counter++;
            }
        }
      return counter;

    }
}
