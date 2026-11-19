package agh.po.Symulator;

public class Samochód {
    Silnik silnik;
    Skrzynia_biegów skrzynia;
    void włącz(){
        this.skrzynia.sprzęgło.wciśnij();
        this.skrzynia.aktualnyBieg = 0;
        this.silnik.uruchom();
    }
    void wyłącz(){
        this.silnik.zatrzymaj();
        this.skrzynia.aktualnyBieg = 0;
    }

    public Samochód(Silnik silnik, Skrzynia_biegów skrzynia) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
    }
}
