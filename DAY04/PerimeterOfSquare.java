package day4;

import java.util.Scanner;

public class PerimeterOfSquare{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();

        double perimeter = 4*side;
        System.out.println(perimeter);  
    }
}
