package day5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year  = in.nextInt();
        if(CheckLeap(year)){
            System.out.println("leap");
        }
        else{
            System.out.println("not a leap year");
        }
        

        }
        static boolean CheckLeap(int year){
        // int year;
        return (year%4==0 && year%100!=0) || year%400==0;
        
        }
    }
    
