package ru.avalon.java.dev.j10.labs;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        System.out.println("**********Fibonacci**********");
        FibonacciInitializer fibonacci = new FibonacciInitializer ();
        fibonacci.initialize(array);
        printArr(array);
        System.out.println("Summ array = " + summArray(array));
        System.out.println(" ");
        
        // ввод числа
        int number = 0;
        System.out.println("Input number");
        try {
            number = (int) System.in.read();
        }
        catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }           
        
        //инициализация и сортировка, с выводом значений
        printR();
        RandomInitializer rnd = new RandomInitializer(number);
        rnd.initialize(array);
        printArr(array);    
        System.out.println(" ");
        System.out.println("**********BubbleSort**********");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        printArr(array);
        
        printR();
        RandomInitializer rnd1 = new RandomInitializer(number);
        rnd1.initialize (array);
        printArr(array);   
        System.out.println(" ");
        System.out.println("**********SelectionSort*********");      
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        printArr(array);
         
        printR();
        RandomInitializer rnd2 = new RandomInitializer(number);
        rnd2.initialize (array);
        printArr(array); 
        System.out.println(" ");
        System.out.println("**********ShellSort*********");      
        ShellSort shellSort = new ShellSort();
        shellSort.sort(array);
        printArr(array);                     
    }
    
      private static int summArray (int [] array){
          int summ = 0;
          for (int j : array){
              summ += j;              
          }
          return summ;
      }
      private static void printArr (int [] array){
          for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
          }
      }
      private static void printR (){
          System.out.println(" ");                    
          System.out.println("**********InitializationArray**********");          
      }
}
        
        
        
        

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
         */