package agh.po.animals;

public class Dog extends Animal{
    String getDescription(){
        return "";
    }
    public Dog(String name) {
        this.name = name;
        this.legs = 4;
    }
}
