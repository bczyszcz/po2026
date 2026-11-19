package agh.po.Symulator;

public class Silnik extends Komponent{
    int maxObroty;
    int obroty;
    void uruchom(){
        this.obroty = 1000;
    }
    void zatrzymaj(){
        this.obroty = 0;
    }


    public Silnik(int maxObroty, int obroty) {
        this.maxObroty = maxObroty;
        this.obroty = obroty;
    }
}
