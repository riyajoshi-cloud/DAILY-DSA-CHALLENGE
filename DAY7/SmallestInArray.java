package day07;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {55, 70, 85 , 55, 10};

        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    
}
