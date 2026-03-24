package day3;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius= sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        System.out.println(perimeter);
      
    }
    
}
