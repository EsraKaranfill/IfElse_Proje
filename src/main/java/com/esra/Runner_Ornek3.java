package com.esra;

import java.util.Scanner;

public class Runner_Ornek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println(sayi + "! = " + faktoriyel);

    }
}
