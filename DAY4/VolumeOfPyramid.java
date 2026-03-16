package day4;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    double base_area = in.nextDouble();
    double height = in.nextDouble();

    double volume = (1.0/3.0)*base_area*height;
    System.out.println(volume);

        
    }
    
}
