public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {10,30,2,7,90};
        System.out.println(max(arr));

    }

    static int max(int[] arr){
        int maxVal = arr[0];

        for(int i=0;i<arr.length;i++){
            if(maxVal<arr[i]){
                maxVal = arr[i];
            }
         
        }
    return maxVal;
    }
}

