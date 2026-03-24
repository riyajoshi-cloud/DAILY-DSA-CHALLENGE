package day07;

public class SecSL02 {
    public static void main(String[] args) {
        int arr[] = {1,1,5,5,9,4,100,100};

        int min1 = Integer.MAX_VALUE;    // so that any value can replace it in array
        int min2 = Integer.MAX_VALUE;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int x : arr){
            if( x > max1){
                max2 = max1;
                max1 = x;
            }
            else if ( x > max2 && x!=max1){
                max2 = x;
            }

            if( x < min1){
                min2 = min1;
                min1 = x;
            }
            else if( x < min2 && x!= min1){
                min2 = x;
            }
        }
        System.out.println(max2);
        System.out.println(min2);
        








    }
    
}
