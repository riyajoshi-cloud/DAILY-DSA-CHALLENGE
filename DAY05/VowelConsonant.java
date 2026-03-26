package day5;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        CheckChar();
    }
    static void CheckChar(){
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("its a vowel");
        }
        else{
            System.out.println("its a consonant");
        }
        
    }
    
}
