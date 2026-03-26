package day5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        CheckEven(digit);
        
    }
    static void CheckEven(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else{
           System.out.println("odd"); 
        }
    }
}
    

