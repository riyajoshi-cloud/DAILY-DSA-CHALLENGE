package day2;
import java.util.Scanner;

// SI = (P*R*T) / 100


public class Si {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int si = (p*r*t) / 100;
        System.out.println(si);
        sc.close();
    }
}
    
}
