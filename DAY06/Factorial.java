package day6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println(CalcFact(num));
    }
    static long CalcFact(int n){
        int fact = 1;
        for(int i = n; i>=1; i--){
            fact = fact * i;
        }
        return fact;
    }
    
}
