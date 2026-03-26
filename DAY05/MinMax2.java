package day5;

import java.util.Scanner;

public class MinMax2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();
        checkMin(a, b, c);
        checkMax(a, b, c);
        
        
    }
    static void checkMin(int a, int b,int c){
        int min=a;
        if(b<min) min = b;
        if(c<min) min = c;
        System.out.println("Minimum is " + min);

    }
    static void checkMax(int a, int b, int c){
        int max = a;
        if(b>max) max = b;
        if(c>max) max = c; 
        System.out.println("max is "+ max);      
}
}

