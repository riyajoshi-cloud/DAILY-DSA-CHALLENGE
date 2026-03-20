package day6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(isPalindrome(num)==true){
            System.out.println("num is palindrome");
        }
        else{
            System.out.println("num is not palindrome");
        }
    }
    static boolean isPalindrome(int n){
        int original = n;
        int rev=0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            rev = rev*10 + rem;
        }
        return rev==original;
    }
    
}
