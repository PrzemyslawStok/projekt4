package com.generics;

import java.util.Scanner;

public class Main {
    double a = 0;
    double b = 1;
    double c = 2;
    double e = 3;
    double f = 4;

    static void wyswietl(){
        String nazwisko;
        String imie;
        int wzrost;
        String adress;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nazwisko: ");
        nazwisko = scanner.next();
        System.out.print("Wzrost:");
        wzrost = scanner.nextInt();
    }

    public static void main(String[] args) {
        // write your code here
        wyswietl();
    }
}
