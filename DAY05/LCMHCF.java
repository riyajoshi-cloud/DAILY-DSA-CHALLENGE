package day5;

import java.util.Scanner;

public class LCMHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(findHcf(a,b));
        System.out.println(findLcm(a, b));

    }
    static int findHcf(int a, int b){
        while(b!=0){
            int temp =b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    static int findLcm(int a, int b){
        int hcf = findHcf(a, b);
        int lcm = (a*b)/hcf;
        return lcm;
    }
        
    }
    

