package utils;

import java.util.Scanner;

public class Utils {

    private Scanner sc;

    public Utils(Scanner sc) {
        this.sc = new Scanner(System.in);
    }

    public static void wykonajMenu() {
        boolean applicationRunning = true;
        int option;
        System.out.println("Start Systemu");
        Scanner sc = new Scanner(System.in);
        while (applicationRunning) {
            System.out.println("Wybierz opcje: ");
            System.out.println("1. Opcja 1");
            System.out.println("2. Opcja 2");
            System.out.println("0. Koniec programu");
            option = sc.nextInt();
            // TODO: 16/02/2020 Wyrzucic opcje do enuma albo do osobnej tabeli
            switch (option) {
                case 1:
                    System.out.println("Opcja 1");
                    break;
                case 2:
                    System.out.println("Opcja 2");
                    break;
                case 0:
                    System.out.println("KONIEC APLIKACJI");
                    applicationRunning = false;
                    break;
                default:
                    System.out.println("Nieznana opcja");
                    break;
            }
        }
    }
}
