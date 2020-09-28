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
public class Task5 {
    public void run(){
        System.out.println("----- Задача 5 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int myArray [][] = new int[10][5];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++)
                myArray[i][j] = random.nextInt(49 + 1);
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println();
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.printf(myArray[i][j] + " ");
        }
        System.out.println("----- конец задачи 5 ------");
    }
}
}
