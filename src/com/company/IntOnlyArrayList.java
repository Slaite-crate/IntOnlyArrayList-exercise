package com.company;

public class IntOnlyArrayList {
    private int[] intArrayList;

    public IntOnlyArrayList(){}

    public int get(int index){
        return intArrayList[index];
    }

    public void add(int value){
        int[] list;
        if (intArrayList == null){
            list = new int[]{value};
        } else {
            list = new int[intArrayList.length + 1];
            for (int i = 0; i < intArrayList.length; i++){
                list[i] = intArrayList[i];
            }
            list[intArrayList.length] = value;
        }
        intArrayList = list;
    }

    public void remove(int index){
        if (intArrayList == null || intArrayList.length == 0){
            System.out.println("no intArrayList");
        } else if (index >= intArrayList.length) {
            System.out.println("no index: " + index);
        } else {
            int[] list = new int[intArrayList.length-1];
            int j = 0;
            for (int i = 0; i < intArrayList.length; i++){
                if (i == index){
                    i++;
                }
                if (list.length != 0) {
                    list[j] = intArrayList[i];
                    j++;
                }
            }
            intArrayList = list;
        }
    }

    public int size(){
        if (intArrayList == null){
            return 0;
        } else {
            return intArrayList.length;
        }
    }

    @Override
    public String toString(){
        if (intArrayList == null || intArrayList.length == 0) {
            return "no intArrayList";
        } else {
            String result = "IntArrayList = {";
            for (int i = 0; i < intArrayList.length; i++) {
                result = result + intArrayList[i] + ", ";
            }
            result = result.substring(0, result.length() - 2);
            result = result + "}";
            return result;
        }
    }
}
