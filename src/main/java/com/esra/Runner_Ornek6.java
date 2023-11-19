package com.esra;

public class Runner_Ornek6 {
    public static void main(String[] args) {
        String kullaniciAdi = "admin";
        String sifre = "12345";
        if (kullaniciAdi.equals("admin") && sifre.equals("12345")) {
            System.out.println("Giriş başarılı, hoş geldiniz!");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı, tekrar deneyin.");
        }
    }
}
