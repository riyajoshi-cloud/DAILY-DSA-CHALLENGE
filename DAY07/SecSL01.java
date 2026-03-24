package day07;

import java.util.Arrays;

public class SecSL01 {
    public static void main(String[] args) {
        int[] arr = { 1,2,1,3,6,6,6,};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = arr.length;

        // second smallest
        int secSmall = -1;
        for (int i = 1; i < n; i++) {  // i = 0 smallest
            if(arr[i]!=arr[0]){    // not duplicate
               secSmall = arr[i];
               break;
            }
        }

        // second largest
        int secL = -1;
        for(int i = n-2; i>=0; i--){
            if(arr[i] != arr[n-1]){
                secL = arr[i];
                break;
            }

        }
        System.out.println(secL);
        System.out.println(secSmall);
    }}