package day07;

import java.util.Arrays;

public class ReverseArr{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;

        int left = 0;
        int right = n-1;
        while(left<right){
            swap(arr,left, right);
            left++;
            right--;
        }
        System.out.print(Arrays.toString(arr));
    
    }
    static void swap(int arr[],int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
   
    
    }
    
