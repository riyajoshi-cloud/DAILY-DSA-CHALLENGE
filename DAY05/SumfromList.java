package day5;

import java.util.Scanner;

public class SumfromList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[] list = new int[size];
        for(int i=0; i<size; i++){
            list[i] = in.nextInt();
        }
        CalcSums(list);

 
    }
    static void CalcSums(int[] list){
        int sumN = 0;
        int sumPE =0;
        int sumPO = 0;
        for(int n : list){
            if(n <0){
                sumN+=n;
            }
            else if(n%2 == 0){
                sumPE+=n;
            }
            else{
                sumPO+=n;
            }
        }
        System.out.println("Sum of negative numbers: "+ sumN);
        System.out.println("Sum of positive even numbers: "+ sumPE);
        System.out.println("Sum of positive odd numbers: "+ sumPO);

    }
}
