package day3;

import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();
        double b = sc.nextDouble();

        double perimeter = 2*(a+b);
        System.out.printf("%.2f", perimeter);
    }
    
}
