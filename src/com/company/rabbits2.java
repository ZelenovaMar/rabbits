package com.company;
import java.util.Scanner;

public class rabbits2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" monthAll = ");
        int monthAll = sc.nextInt();
        System.out.print(" monthLive = ");
        int monthLive = sc.nextInt();

        long[] F = new long[monthAll + 1];
        long[] rabbits = new long[monthLive];
        rabbits[0] = 1;
        F[1] = 1;

        for (int i = 2; i <= monthAll; i++) {

            long[] next = new long[monthLive];
            for (int j = 1; j < monthLive; j++) {
                next[j] = rabbits[j - 1];
                next[0] += rabbits[j];
            }

            for (int k = 0; k < monthLive; k++) {
                rabbits[k] = next[k];
                F[i] += rabbits[k];
            }

            System.out.print(" " + F[i]);
        }

        System.out.println("\n" + F[monthAll]);
    }
}