package agh.po.animals;

public class Parrot extends Animal{
    String getDescription(){
        return "";
    }
    public Parrot(String name) {
        this.name = name;
        this.legs = 2;
    }
}
