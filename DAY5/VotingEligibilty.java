package day5;

import java.util.Scanner;

public class VotingEligibilty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age  = in.nextInt();
        CheckEligibility(age);
        
        
    }
    static void CheckEligibility(int n){
        if(n>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
    
}
