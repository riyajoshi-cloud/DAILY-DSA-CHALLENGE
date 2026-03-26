package day5;
import java.util.*;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        SumOfDigits(digit);

    }
    static int SumOfDigits(int digit){
        int sum = 0;
        while(digit>0){
            int rem = digit%10;
            sum = sum + rem;
            digit = digit/10;
        }
        System.out.println(sum);
        return sum;

    }
    
}
