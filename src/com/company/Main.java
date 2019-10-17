package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void menu1(){
        System.out.println("Задание 1: ");
        System.out.println("Введите 0, чтобы вывести меню");
        System.out.println("Введите 1, чтобы ввести художественный текст");
        System.out.println("Введите 2, чтобы преобразовать все слова к одному формату");
        System.out.println("Введите 3, чтобы сформировать массив из слов");
        System.out.println("Введите 4, чтобы сформировать массив вхождений каждого найденного слова в текст");
        System.out.println("Введите 5, чтобы определить, сколько слов начинаются с заданного префикса");
        System.out.println("Введите 6, чтобы вернуться в главное меню");
    }

    public static void task1_choise(){
        menu1();
        int command = 0;
        Task1 task1 = new Task1();

        while(command!=6){
            System.out.println("Ожидание ввода");
            Scanner in = new Scanner(System.in);
            command = in.nextByte();;
            switch (command){
                case 0:
                    menu1();
                    break;
                case 1:
                    task1.input();
                    break;
                case 2:
                    task1.convert();
                    break;
                case 3:
                    task1.array();
                    break;
                case 4:
                    task1.entrys();
                    break;
                case 5:
                    task1.perfix();
                    break;
                case 6:
                    main_menu();
                    break;
            }
        }
    }

    public static void menu2(){
        System.out.println("Задание 2: ");
        System.out.println("Введите 0, чтобы вывести меню");
        System.out.println("Введите 1, чтобы ввести текст, состоящий из предложений");
        System.out.println("Введите 2, чтобы найти в тексте двузначные числа и заменить их строкой из символов длиной равной двузначному числу");
        System.out.println("Введите 3, чтобы добавить в самое короткое предложение текста одно слово КОНЕЦ");
        System.out.println("Введите 4, чтобы найти трехзначные числа и заменить из обратными числами, т.е.число 123 заменить на 321");
        System.out.println("Введите 5, чтобы вернуться в главное меню");
    }

    public static void task2_choise(){
        menu2();
        int command = 0;
        Task2 task2 = new Task2();

        while(command!=5){
            System.out.println("Ожидание ввода");
            Scanner in = new Scanner(System.in);
            command = in.nextByte();;
            switch (command){
                case 0:
                    menu2();
                    break;
                case 1:
                    task2.input();
                    break;
                case 2:
                    task2.find2Numbers();
                    break;
                case 3:
                    task2.add();
                    break;
                case 4:
                    task2.find3Numbers();
                    break;
                case 5:
                    main_menu();
                    break;
            }
        }
    }

    public static void menu3(){
        System.out.println("Задание 3: ");
        System.out.println("Введите 0, чтобы вывести меню");
        System.out.println("Введите 1, чтобы ввести текст");
        System.out.println("Введите 2, чтобы определить, что строка является корректным email-ом");
        System.out.println("Введите 3, чтобы сформировать список всех электронных адресов, содержащихся в этом тексте");
        System.out.println("Введите 4, чтобы вернуться в главное меню");
    }

    public static void task3_choise(){
        menu3();
        int command = 0;
        Task3 task3 = new Task3();

        while(command!=4){
            System.out.println("Ожидание ввода");
            Scanner in = new Scanner(System.in);
            command = in.nextByte();;
            switch (command){
                case 0:
                    menu3();
                    break;
                case 1:
                    task3.input();
                    break;
                case 2:
                    task3.isCorrect();
                    break;
                case 3:
                    task3.list();
                    break;
                case 4:
                    main_menu();
                    break;
            }
        }
    }

    public static void main_menu(){
        System.out.println("Меню: ");
        System.out.println("Введите 0, чтобы вывести меню");
        System.out.println("Введите 1, чтобы перейти к заданию 1");
        System.out.println("Введите 2, чтобы перейти к заданию 2");
        System.out.println("Введите 3, чтобы перейти к заданию 3");
        System.out.println("Введите 4, чтобы закрыть программу");
    }

    public static void main(String[] args) {
        main_menu();
        int command = 0;

        while(command!=4){
            System.out.println("Ожидание ввода");
            Scanner in = new Scanner(System.in);
            command = in.nextByte();;
            switch (command){
                case 0:
                    main_menu();
                    break;
                case 1:
                    task1_choise();
                    break;
                case 2:
                    task2_choise();
                    break;
                case 3:
                    task3_choise();
                    break;
            }
        }
    }
}
