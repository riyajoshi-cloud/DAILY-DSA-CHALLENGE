package day2;

import java.util.Scanner;

public class Calculator{
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c= sc.next().charAt(0);
        if(c =='+'|| c =='-'|| c=='*'|| c =='/'|| c=='%'){

            switch(c) {
                case '+' -> System.out.println(a+b);
                case '-' -> System.out.println(a-b);
                case '*' -> System.out.println(a*b);
                case '%' -> System.out.println(a%b);
                case '/' -> System.out.println(a%b);
                default -> System.out.println("Wrong input");
            }
    }
        sc.close();
    }

}
