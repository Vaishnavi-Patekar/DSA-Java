import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
         trailingZero(arr);
         //print array
         for (int value : arr){
            System.out.print(value + "\t");
         }
        System.out.println();
    }

    public static void trailingZero(int[] arr){
        int index = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
            index++;
        
        }

        }
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }

        
    }
}
