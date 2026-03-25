package day07;

public class Average {
    public static void main(String[] args) {
        double[] arr = {1,2,3,4,5};
        double sum = 0;
        for(double nums : arr){
            sum += nums;
        }
        double average = sum/arr.length;
        System.out.println(average);
    }
    
}
