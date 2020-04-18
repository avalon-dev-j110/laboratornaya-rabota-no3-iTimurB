package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

public class SelectionSort implements Sort {
    @Override
    public void sort(int[] array) {
        int temp;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            //TODO: Иммеет ли смысл проверка с флагом при этом алгоритме?
            boolean flag = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j])
                    index = j;
                //TODO:  Это находится за пределами блока if.
                //TODO:  То есть выполняется всегда.
                flag = true;
                count += 1;

            }
            if (!flag) break;
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        System.out.println("count = " + count);
    }
}
