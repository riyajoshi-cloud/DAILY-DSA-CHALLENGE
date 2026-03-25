package day07;

import java.util.Arrays;

public class RearrangeAscending {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;

        Arrays.sort(arr); // 1 2 3 4 5 6 
        System.out.print(Arrays.toString(arr));
        int mid = n/2;
        int left = mid;
        int right = n-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.print(Arrays.toString(arr));
    




    }
    
}
