package day07;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;

        // 
        for(int nums : arr){
            sum+= nums;
        }
        System.out.println(sum);
    }
    
}
