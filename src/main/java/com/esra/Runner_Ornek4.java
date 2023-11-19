package com.esra;

import java.util.Scanner;

public class Runner_Ornek4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin kenar uzunluklarını giriniz:\nKenar 1: ");
        int kenar1 = scanner.nextInt();

        System.out.print("Kenar 2: ");
        int kenar2 = scanner.nextInt();

        System.out.print("Kenar 3: ");
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Bu bir eşkenar üçgendir.");
        } else if (kenar1 == kenar2 || kenar2 == kenar3 || kenar1 == kenar3) {
            System.out.println("Bu bir ikizkenar üçgendir.");
        } else {
            System.out.println("Bu bir çeşitkenar üçgendir.");
        }
    }
}
