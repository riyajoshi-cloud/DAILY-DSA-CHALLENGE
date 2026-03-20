package day6;

public class PythagoreanTriplet {
    // ARRAY BEST
    public static void main(String[] args) {
       if(isPythagoreanTriplet(5, 12, 13)==true){
        System.out.println("yes they are a pythagorean triplet");
       }
       else{
        System.out.println("they are not a pythagorean triplet");
       }
        
    }
    static boolean isPythagoreanTriplet(int a, int b, int c){
        int[] nums= {a,b,c};
        java.util.Arrays.sort(nums);
        return nums[0]*nums[0] + nums[1]*nums[1] == nums[2]*nums[2];

    }
    
}
