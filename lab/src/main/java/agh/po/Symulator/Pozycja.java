package agh.po.Symulator;

public class Pozycja {
    double x;
    double y;

    void aktualizujPozycje(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
