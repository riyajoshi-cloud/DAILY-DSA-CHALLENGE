package day5;
import java.util.*;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( CalcSum(sc));
        
    }
    static int CalcSum(Scanner sc){
        int sum=0, num;
        while((num = sc.nextInt()) !=0){
            sum = sum + num;
        }
        return sum;
    }
    

    
}

