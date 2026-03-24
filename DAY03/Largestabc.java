package day3;
public class Largestabc {
    public static void main(String[] args) {

        int a = 100;
        int b = 59;
        int c = 60;

        int max = a;
        if(b>max){
           max = b;
        }
        if(c>max){
           max = c;
        }
        System.out.println(max);

        
    }
       
}
