package day4;
import java.util.Scanner;


public class VolumeOfSphere {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double r = in.nextDouble();

    double volume = (4.0/3.0)*(Math.PI*r*r*r);
    System.out.println(volume);


        
    }
    
}
