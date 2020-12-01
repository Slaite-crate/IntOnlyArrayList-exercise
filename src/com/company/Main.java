package com.company;

public class Main {

    private static Menu menu;

    public static void main(String[] args) {
        menu = new Menu();
        System.out.print("10 ");
        hello(10);
        System.out.print("50 ");
        hello(50);
        System.out.print("100 ");
        hello(100);
        System.out.print("500 ");
        hello(500);
        System.out.print("1000 ");
        hello(1000);
        System.out.print("2000 ");
        hello(2000);
        System.out.print("4000 ");
        hello(4000);
        System.out.print("6000 ");
        hello(6000);
        System.out.print("8000 ");
        hello(8000);
        System.out.print("10000 ");
        hello(10000);
        System.out.print("15000 ");
        hello(15000);
    }

    public static void hello(int x){
        long twenty = 0;
        for (int i = 0; i < 20; i++){
            twenty += menu.hello(x);
        }
        twenty = twenty/20;
        System.out.println("tid: " + twenty + " ms");
    }
}
