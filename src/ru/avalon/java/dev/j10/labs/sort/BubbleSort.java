package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;
public class BubbleSort implements Sort {
    @Override
    public void sort(int[] array) {
        int temp;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 1; j < array.length-i; j++) {
                if (array[j]>array[j-1]) {
                    temp = array [j];
                    array [j]=array[j-1];
                    array [j-1] = temp;    
                    flag = true;
                    count +=1;
                }                
            }
            if (!flag) break;
        }
        System.out.println("count = " + count);        
    }
}
