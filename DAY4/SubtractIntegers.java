package day4;

import java.util.Scanner;

public class SubtractIntegers {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n  = in.nextInt();
    int sum = 0;
    int product = 1;

    
    while(n>0){
        int last = n%10;
        sum = sum + last;
        product = product * last;
        n = n/10;
    }
    System.out.println("product is : " + product);
    System.out.println("sum is : " + sum);

    int subtract = product - sum;

    System.out.println("Subtract product and sum : " + subtract);

        
        
    }
}

