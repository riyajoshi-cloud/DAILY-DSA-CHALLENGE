package day2;

import java.util.Scanner;

public class Palind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(n);

        String rev= "";

        System.out.println(n.length());
        for(int i=n.length() - 1; i>=0; i--){   // REVERSE
            rev = rev + n.charAt(i);
        }

        if(n.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }        
        }
        
    }
    

