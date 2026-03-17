package day5;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        PerfectNumber(n);
       
    }
    static int PerfectNumber(int n){
        int sum = 0;
        for(int i=1; i*i<= n; i++){
            if(n%i == 0){
                sum = sum + i;
                System.out.println(sum);
               
            }
            
        }
        // System.out.println(sum);
        return sum;
    }
}
