package com.esra;

import java.util.Scanner;

public class Runner_Ornek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Asal sayı kontrolü için bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        boolean asal = true;

        if (sayi <= 1) {
            asal = false;
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
        }

        if (asal) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

    }
}
