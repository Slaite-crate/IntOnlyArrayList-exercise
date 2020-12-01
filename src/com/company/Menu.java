package com.company;

import java.util.Scanner;

public class Menu {
    private IntOnlyArrayList AL;

    public Menu(){
    }

    /*
    public void starts(){
        boolean go = true;
        while (go){
            menu();
            Scanner sc = new Scanner(System.in);
            int tal = sc.nextInt();
            if (tal == 1){
                System.out.println("add number: ");
                AL.add(sc.nextInt());
            }
            if (tal == 2){
                System.out.println("index: ");
                System.out.println("value at index: " + AL.get(sc.nextInt()));
            }
            if (tal == 3){
                System.out.println("index: ");
                AL.remove(sc.nextInt());
            }
            if (tal == 4){
                System.out.println(AL.size());
            }
            if (tal == 5){
                int index = sc.nextInt();
                int value = sc.nextInt();
                AL.add(index,value);
            }
            System.out.println(AL);
        }
    }
     */

    private void menu(){
        System.out.println("1: add");
        System.out.println("2: get");
        System.out.println("3: remove");
        System.out.println("4: size");
        System.out.println("5: add(index, value)");
    }

}

