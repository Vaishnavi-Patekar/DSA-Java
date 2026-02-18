public class PrintIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,9,2,3,9};
        int x = 2;
        System.out.println(printIdx(arr,x,0));
    }

    public static int printIdx(int arr[], int x, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == x){
            return i;
        }else{
            int idx = printIdx(arr, x, i+1);
            return idx;
        }

     
    

    }
}
