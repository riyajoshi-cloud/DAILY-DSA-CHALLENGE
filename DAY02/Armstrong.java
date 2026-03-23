package day2;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int temp = n;
        int sum=0;

        while(n>0){
        int r = n%10;
         n  = n/10;
        sum = sum + r*r*r;
        }

        if(temp==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }


        

        
    }
    
}
