package day6;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1-100");
        int num = sc.nextInt();
        System.out.println(getGrade(num));
    }
    static String getGrade(int n){
        if(n>=91) return "AA";
        else if(n>=81) return "AB";
        else if(n>=71) return "BB";
        else if(n>=61) return "BC";
        else if(n>=51) return "CD";
        else if(n>=41) return "DD";
        else
            return "Fail";
    }
}
