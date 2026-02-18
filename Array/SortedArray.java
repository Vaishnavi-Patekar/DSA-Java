import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        checkSorted(arr);
        System.out.println(checkSorted(arr));
    }

    public static boolean checkSorted(int[] arr){
           boolean isSorted = true;
           for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                isSorted=false;
            }      
        
        }
        return isSorted;
    }
}
