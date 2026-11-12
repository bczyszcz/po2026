package agh.po.animals;

public class Snake extends Animal{
    String getDescription(){
        return "";
    }
    public Snake(String name) {
        this.name = name;
        this.legs = 0;
    }
}
