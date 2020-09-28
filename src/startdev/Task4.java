/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author user
 */
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        Random random = new Random();
        int [] myArray = new int[10];
        int evenNumber;
        for (int i = 0; i < myArray.length; i++) {
            while (true) {
                evenNumber = random.nextInt(49 + 1);
                if (evenNumber % 2 == 0) {
                    myArray[i] += evenNumber;
                    break;
                }
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%4d", myArray[i]);
        }

        System.out.println();
        System.out.println("----- конец задачи 4 ------");
    }
}
