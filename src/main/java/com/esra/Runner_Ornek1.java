package com.esra;

public class Runner_Ornek1 {
    public static void main(String[] args) {
        int sinavNotu = 75;

        if (sinavNotu >= 70) {
            System.out.println("Tebrikler, sınavı geçtiniz!");

            if (sinavNotu >= 90) {
                System.out.println("Harf Notunuz: A");
            } else if (sinavNotu >= 80) {
                System.out.println("Harf Notunuz: B");
            } else {
                System.out.println("Harf Notunuz: C");
            }
        } else {
            System.out.println("Üzgünüz, sınavı geçemediniz.");
        }
    }
}