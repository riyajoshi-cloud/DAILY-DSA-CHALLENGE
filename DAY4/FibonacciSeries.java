package day4;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        System.out.print(a+ " ");
        System.out.print(b+ " ");

        for(int i=1; i<=n; i++){
            int c = a+b;
            a=b;
            b=c;
            System.out.print(c + " ");
        }
        
    }
    
}
