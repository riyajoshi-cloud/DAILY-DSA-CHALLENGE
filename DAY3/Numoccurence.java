package day3;
import java.util.*;

public class Numoccurence {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n = sc.nextInt();
        System.out.println("Enter which number to check");
        int x = sc.nextInt();
        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem == x){
              count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }


    
}
