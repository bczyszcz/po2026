package agh.po.Symulator;

public class Sprzęgło extends Komponent{
    boolean stanSprzęgła;
    void wciśnij(){
        this.stanSprzęgła = true;
    }
    void zwolnij(){
        this.stanSprzęgła = false;
    }

    public String isStanSprzęgła() {
        if (this.stanSprzęgła){
            return "wciśnięty";
        }
        else {
            return "Zwolniony";
        }
    }

    public Sprzęgło(boolean stanSprzęgła) {
        this.stanSprzęgła = stanSprzęgła;
    }
}
