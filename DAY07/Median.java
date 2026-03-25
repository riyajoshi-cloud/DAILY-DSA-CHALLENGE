package day07;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        double[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        Arrays.sort(arr);
        double median;

        if(n%2 ==0){  // even
            median = (arr[n/2] + arr[(n/2)-1]) /2.0;     
        }
        else{
            median = arr[n/2];
        }
        System.out.println(median);
    }
    
}
