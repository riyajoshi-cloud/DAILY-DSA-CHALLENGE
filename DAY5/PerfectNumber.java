package day5;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        // PerfectNumber(n);
        System.out.println(PerfectNumber(n));
       
    }
    static boolean PerfectNumber(int n){
        int sum = 0;
        for(int i=1; i <= n/2; i++){
            if(n%i == 0){
                // System.out.print(i + " ");
                sum = sum + i; 
            }
               
        }
        System.out.println("SUM IS:" + sum); 
        return sum == n;
        
    }
}
