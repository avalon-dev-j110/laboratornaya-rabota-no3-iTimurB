package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

public class SelectionSort implements Sort {

    @Override
    public void sort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            //TODO: Иммеет ли смысл проверка с флагом при этом алгоритме?

            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                    //TODO:  Это находится за пределами блока if.
                    //TODO:  То есть выполняется всегда.
                    count += 1;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        System.out.println("count = " + count);
    }
}
