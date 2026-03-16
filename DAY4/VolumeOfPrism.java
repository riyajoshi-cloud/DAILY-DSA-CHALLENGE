package day4;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base_area = in.nextDouble();
        double height = in.nextDouble();

        double volume = base_area * height;    // volume = l*b*h
        System.out.println(volume);
        
    }
    
}
