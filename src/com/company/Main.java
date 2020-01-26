package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите количество месяцев");
        int month = sc.nextInt();
        System.out.println("Введите коэффициент размножения");
        int k = sc.nextInt();
        long child_rabbits = 1, adult_rabbits = 0;
        long sum;
        for (int i = 1; i < month; i++){
            sum = child_rabbits;
            //System.out.println(sum);
            child_rabbits = adult_rabbits*k;
            adult_rabbits += sum;
        }
        System.out.println(child_rabbits+adult_rabbits);
    }
}