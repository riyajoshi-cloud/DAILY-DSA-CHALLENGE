package day07;

public class LargestInArray {
    public static void main(String[] args) {
        int arr[]= {24 ,55 ,67 ,8 ,10};

        int max= arr[arr.length -1];      // arr.length will be out of bound
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
            }  
        }
        System.out.println(max);

    }
    
}
