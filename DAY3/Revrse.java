package day3;

public class Revrse{
    public static void main(String[] args) {
        String str = "riya";
        String rev= "";

        System.out.println(str.length());
        // System.out.println(str.charAt(str.length()));

        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

    }
}