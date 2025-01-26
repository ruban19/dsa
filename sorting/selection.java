import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        
        for (int i = 0 ; i < arr.length - 1; i++) {
            int minimum_index = i;
            for (int j = i+1 ; j <arr.length ; j++ ) {
                if (arr[j] < arr[minimum_index]) {
                    minimum_index = j ;
                 }
            }
            int temp = arr[minimum_index];
            arr[minimum_index] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
