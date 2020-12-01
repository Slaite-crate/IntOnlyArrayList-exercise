package com.company;

public class Main {

    private static IntOnlyArrayList AL;

    public static void main(String[] args) {
        int[] arrayLength = {10,20,50,100,500,1000,5000,10000,20000,50000,100000};
        int loops = 20;
        for (int length : arrayLength){
            System.out.println("array længde: " + length + "    tid: " + averageTimeForArray(length,loops) + "ms");
        }
    }

    public static long averageTimeForArray(int length, int loops){
        long time = 0;
        for (int i = 0; i < loops; i++){
            time += timeForArray(length);
        }
        return time/loops;
    }

    public static long timeForArray(int length){
        AL = new IntOnlyArrayList();
        long startTid = System.currentTimeMillis();
        for (int i = 0; i < length; i++){
            AL.add(i);
        }
        return (System.currentTimeMillis() - startTid);
    }
}
