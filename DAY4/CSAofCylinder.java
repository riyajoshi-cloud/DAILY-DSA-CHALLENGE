package day4;

import java.util.Scanner;

public class CSAofCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double height = in.nextDouble();

        double csa = 2*Math.PI*r*height;
        System.out.println(csa);

    }
    
}
