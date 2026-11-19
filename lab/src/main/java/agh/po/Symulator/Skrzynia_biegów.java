package agh.po.Symulator;

public class Skrzynia_biegów extends Komponent{
    int aktualnyBieg;
    int iloscBiegow;
    Sprzęgło sprzęgło;
    void zwiększBieg(){
        if (aktualnyBieg<iloscBiegow){
            this.sprzęgło.wciśnij();
            this.aktualnyBieg += 1;
            this.sprzęgło.zwolnij();
        }
    }
    void zmniejszBieg(){
        if (aktualnyBieg>0){
            this.sprzęgło.wciśnij();
            this.aktualnyBieg -=1;
            this.sprzęgło.zwolnij();
        }
    }

    public Skrzynia_biegów(int aktualnyBieg, int iloscBiegow, Sprzęgło sprzęgło) {
        this.aktualnyBieg = aktualnyBieg;
        this.iloscBiegow = iloscBiegow;
        this.sprzęgło = sprzęgło;
    }
}
