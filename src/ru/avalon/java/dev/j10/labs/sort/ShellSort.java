package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

public class ShellSort implements Sort {

    @Override
    public void sort(int[] array) {
        //код честно скоппирован с wiki и детально разобран
        for (int inc = array.length / 2; inc >= 1; inc = inc / 2){
            for (int step = 0; step < inc; step++){                
                insertionSort (array, step, inc); 
            }
        }
    }

    private void insertionSort (int[] arr, int start, int inc){
        int tmp;
        for (int i = start; i < arr.length - 1; i += inc){
            for (int j = Math.min(i+inc, arr.length-1); j-inc >= 0; j = j-inc){              
                if (arr[j - inc] > arr[j]){                    
                    tmp = arr[j];
                    arr[j] = arr[j-inc];
                    arr[j-inc] = tmp;                    
                }
                else break;
            }
        }
    }
}
