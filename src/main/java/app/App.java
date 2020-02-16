package app;

import entity.Dragon;
import entity.User;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Start systemu");
        DataInit dataInit = new DataInit();

        User p1 = dataInit.getPlayer1();
        User p2 = dataInit.getPlayer2();
        Dragon initDragon = dataInit.getInitDragon();

        System.out.println(p1);
        System.out.println(p2);

        p1.wykonajSmoka(dataInit.initDragon);
        System.out.println(p1);

        p2.wykonajSmoka(initDragon);
        System.out.println(p2);

        wykonajMenu();
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
