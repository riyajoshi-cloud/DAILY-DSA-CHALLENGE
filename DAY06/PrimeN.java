package day6;

import java.util.Scanner;

public class PrimeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // isPrime(num);
        System.out.println(isPrime(num));
        
    }
    static boolean isPrime(int n){
        if(n==1) return false;
        if(n==2) return true;
        for(int i=2; i*i<=n; i++ ){
            if(n%i==0) return false;
        }
        return true;
    }
}
