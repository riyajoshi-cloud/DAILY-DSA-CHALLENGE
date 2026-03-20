package day6;

import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you need to calc sum");
        int num = sc.nextInt();
        System.out.println(calcSum(num));
        
    }
    static long calcSum(int n){
        return(long) n*(n+1)/2;
    }
}
