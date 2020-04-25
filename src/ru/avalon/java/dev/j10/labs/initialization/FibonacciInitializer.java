package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

public class FibonacciInitializer implements Initializer {    
    @Override
    public void initialize(int[] array) {
        if (array.length == 0 || array.length == 1){
            System.out.println("Array is empty");
          return;  
        }
        //TODO: Объявите переменную чтобы она была видна только внутри цикла.
        //int i;
        array [0] = 0;
        //TODO: Если бует передан массив длинной в 1 элемент, то проверка выше будет пройдена,
        //TODO: а при попытке обращения к элементу с индексом 1 будет исключение.
        array [1] = 1;
        for (int i = 2; i < array.length; i++){
            array[i]=array[i - 1] + array [i - 2];
        }             
    }
}
