public class file4 {
    public static void main(String[] args) {
        int[] arr ={10,30,20,40,50};
        int target = 30;

int low = 0, high = arr.length - 1;

while (low <= high) {
    int mid = (low + high) / 2;

    if (arr[mid] == target) {
        System.out.println(mid);
    }
    
    else if (arr[mid] < target) {
        low = mid + 1;}

    else{
         high = mid - 1;
    } 
}

    }
}
