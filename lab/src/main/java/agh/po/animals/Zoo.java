package agh.po.animals;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public Zoo() {
        Random rand = new Random();

        for (int i = 0; i < animals.length; i++) {
            int typ = rand.nextInt(3);
            //System.out.println("typ = " + typ);

            switch (typ) {
                case 0:
                    animals[i] = new Parrot("papuga");
                    break;
                case 1:
                    animals[i] = new Dog("pies");
                    break;
                case 2:
                    animals[i] = new Snake("wąż");
                    break;
            }
        }
    }

    int getTotalLegs() {
        int sum = 0;
        for (Animal a : animals) {
            if (a != null) {
                sum += a.legs;
                //System.out.println(sum);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println("Suma nóg: " + zoo.getTotalLegs());
    }
}