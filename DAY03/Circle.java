package day3;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        //area 

        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius ;
        System.out.println(area);
    }
    
}
