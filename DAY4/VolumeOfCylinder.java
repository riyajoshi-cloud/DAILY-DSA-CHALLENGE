package day4;
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double r = in.nextDouble(); 
    double h = in.nextDouble();

    double volume = Math.PI*r*r*h;
    System.out.println(volume);
    }
}
