/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        Random random = new Random();
        System.out.println("Отгадай его!");
        int myNumber = random.nextInt((10 - 5) + 1)+ 5;
        Scanner scanner = new Scanner (System.in);
        int gamerNumber = scanner.nextInt();
        if(myNumber == gamerNumber){
            System.out.println("ты выиграл!");
        }else{
            System.out.println("ты проиграл! Было задумано: "
            + myNumber);
        System.out.println("----- конец задачи 2 ------");
        }
    }
}