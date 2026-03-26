package day5;

import java.util.Scanner;

public class KunalEvenDays {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // AUGUST MONTH CALCULATE
        Scanner sc =  new Scanner(System.in);
        // String month = sc.next();
        int days = sc.nextInt();
        sc.close();
        // CheckEvenDays(days);
        System.out.println(checkEvenDays(days));


    }
    static int checkEvenDays(int days){
        int count = 0;
        for(int i=1; i<=days; i++){
            if(i  % 2==0){
                count++;
                // System.out.println(count);
            }

        }
        return count;


    }
    
}
