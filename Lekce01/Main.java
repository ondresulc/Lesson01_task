package Lekce01;

import java.math.BigDecimal;

public class Main {
    public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }
    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }
    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }
    public static void ukol5() {
        BigDecimal increment = BigDecimal.valueOf(0.1);
        BigDecimal amount = BigDecimal.valueOf(0);
        for (int i = 0; i < 10; i++) {
            amount = amount.add(increment);
        }
        System.out.println(amount);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }
    //druha varianta
    public static void ukol5b() {
        double cena = 0;
//        for (int i = 0; i < 10; i++) {
        cena = 10*0.1;
//        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }
    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0.1);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }
    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }
    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " + velikostKosile+ ".");
    }
    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }
    public static void main(String[] args) {
//        System.out.println("Oprav chyby a spusť všechny metody!");
//        System.out.println("Komentáře odstraníš klávesovou zkratkou <Ctrl>+</> - použij lomítko na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol5b();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}