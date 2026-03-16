package day4;
import java.util.*;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        double breadth = in.nextDouble();

        double perimeterOfRectangle = 2*(length + breadth);
        System.out.println(perimeterOfRectangle); 
    }
    
}
