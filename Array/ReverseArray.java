import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,30,50,29,80};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
      int start = 0;
      int end = arr.length-1;

      while(start<end){
        //swap
       int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;

      }
    }
}
