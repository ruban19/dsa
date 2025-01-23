import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        reverse(0,arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void reverse(int index, int[] arr, int len) {
        if (index >= len/2) {
            return;
        }
        swap(index, len-index-1, arr);
        reverse(index+1 , arr, len);
    }
    
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
