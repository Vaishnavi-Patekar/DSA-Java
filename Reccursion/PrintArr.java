public class PrintArr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        printArray(arr,0);
    }

    public static void printArray(int[] arr, int i){
          if(i==arr.length){
            return;
          }
           System.out.println(arr[i]); 
          printArray(arr, i+1);
         
    }
}
