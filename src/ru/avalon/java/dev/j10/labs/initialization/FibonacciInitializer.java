package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

public class FibonacciInitializer implements Initializer {    
    @Override
    public void initialize(int[] array) {
        if (array.length == 0){
            System.out.println("Array is empty");
          return;  
        } 
        int i;
        array [0] = 0;
        array [1] = 1;
        for (i = 2; i < array.length; i++){
            array[i]=array[i - 1] + array [i - 2];
        }             
    }
}
