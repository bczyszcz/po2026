package agh.po.Symulator;

public class Main {
    public static void main(String[] args) {
        Sprzęgło sprzęgło = new Sprzęgło(true);
        Silnik silnik = new Silnik(8000, 1000);
        Skrzynia_biegów skrzynia = new Skrzynia_biegów(0, 5, sprzęgło);
        Samochód samochód = new Samochód(silnik, skrzynia);
        samochód.włącz();
        samochód.skrzynia.zwiększBieg();
        samochód.skrzynia.zwiększBieg();
        samochód.skrzynia.zmniejszBieg();
        System.out.println(samochód.silnik.obroty);
        System.out.println(samochód.skrzynia.aktualnyBieg);
        System.out.println(samochód.skrzynia.sprzęgło.isStanSprzęgła());
    }
}