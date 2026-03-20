package day6;

import java.util.Scanner;

public class Primebw2 {
    public static void main(String[] args) {
        System.out.println("Enter start and end between which you need to find primes");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printPrimes(a,b);
    }
    static void printPrimes(int start, int end){
        for(int i=start; i<=end; i++){
        if(isPrime(i)){
            System.out.print(i + " ");
        }
    }
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
