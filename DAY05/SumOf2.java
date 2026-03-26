package day5;

import java.util.Scanner;

public class SumOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        System.out.println(SumOfNum(n1,n2));
    }
    static int SumOfNum(int n,int m){
        int sum = n+m;
        return sum;

    }
    
}
