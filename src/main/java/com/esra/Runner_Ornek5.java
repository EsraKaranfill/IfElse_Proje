package com.esra;

import java.util.Scanner;

public class Runner_Ornek5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün miktarını giriniz: ");
        int urunMiktari = scanner.nextInt();

        System.out.print("Birim fiyatını giriniz: ");
        double birimFiyat = scanner.nextDouble();

        // Toplam fiyatı hesapla
        double toplamFiyat = urunMiktari * birimFiyat;

        // İndirim hesapla
        double indirimOrani = 0;
        if (toplamFiyat >= 100) {
            indirimOrani = 0.1;
        } else if (toplamFiyat >= 50) {
            indirimOrani = 0.05;
        }

        // İndirimli fiyatı hesapla
        double indirimliFiyat = toplamFiyat - (toplamFiyat * indirimOrani);

        System.out.println("Toplam Fiyat: " + toplamFiyat);
        System.out.println("İndirim Oranı: %" + (indirimOrani * 100));
        System.out.println("İndirimli Fiyat: " + indirimliFiyat);

    }
}
