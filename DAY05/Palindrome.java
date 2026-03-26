package day5;

import java.util.Scanner;

public class Palindrome {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev = isPalindrome(n);
        if(rev == n){
            System.out.println("palindrome");
        }      
        else{
            System.out.println("not palindrome");
        } 
    }

    static int isPalindrome(int m){
        int rev = 0;

        while(m>0){
            int rem = m  % 10;
            rev = rev * 10 + rem;
            m = m/10;
            
        }
        System.out.println(rev);
        return rev;

    }

  
}

        
