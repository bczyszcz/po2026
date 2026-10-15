package agh.po.lab2;

import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        //lista.add(7);
        //boolean jest = lista.contains(7);
        /*for (int i = 0; i<6; i++) {
            int los = (int) Math.floor((Math.random() * 49) + 1);
            boolean jest = lista.contains(los);
            if (jest){
                i-=1;
            }
            else {
                lista.add(los);
            }
        }
        System.out.println("Wylosowane: " + lista);
        int trafienia =0;
        System.out.print("Twoja lista: " + Arrays.toString(args));
        for (int i = 0; i<6; i++){
            int los2 = Integer.parseInt(args[i]);
            boolean jest2 = lista.contains(los2);
            if (jest2){
                trafienia +=1;
            }
        }
        System.out.println();
        System.out.println("Trafienia: " +trafienia);
        */
        float a = System.currentTimeMillis();
        int proby = 1;
        while (true){
            int trafienia =0;
            for (int i = 0; i<6; i++) {
                int los = (int) Math.floor((Math.random() * 49) + 1);
                boolean jest = lista.contains(los);
                if (jest){
                    i-=1;
                }
                else {
                    lista.add(los);
                }

            }
            for (int i = 0; i<6; i++){
                int los2 = Integer.parseInt(args[i]);
                boolean jest2 = lista.contains(los2);
                if (jest2){
                    trafienia +=1;
                }
            }
            if (trafienia==6){
                break;
            }
            else {
                proby +=1;
            }
        }
        float b = a-System.currentTimeMillis();
        System.out.println("Czas: "+b);
        System.out.println("Próby: " +proby);

    }
}
