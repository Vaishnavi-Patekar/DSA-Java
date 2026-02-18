package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,8,-1,5,3,7};
        selectionS(arr);

    }

    static void selectionS(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int minVal = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minVal]){
                 minVal =j;
                }
            }

            int temp = arr[minVal];
            arr[minVal] = arr[i];
            arr[i] = temp;
        }

        for(int val:arr){
            System.out.println(val);
        }
    }
    
}
