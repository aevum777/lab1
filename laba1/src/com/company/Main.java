package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Array array = new Array();
        int n,p;
        int t = 1;
        while (t == 1) {
            System.out.println("1.Ввод с клавиатуры" + "\n" + "2.Случайные числа" + "\n" + "3.Массив слево направо" + "\n" + "4.Массив справо налево" + "\n" + "5.Количество чисел в диапазоне" + "\n" + "6.Сортировка"+"\n" + "7.Выход");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Введите количество элементов массива");
                    p = in.nextInt();
                    array.readArray(p);
                    break;
                case 2:
                    System.out.println("Введите количество элементов массива");
                    p = in.nextInt();
                    array.readArrayRandom(p);
                    break;
                case 3:
                    array.printArray();
                    break;
                case 4:
                    array.printArrayInv();
                    break;
                case 5:
                    array.arrayRange();
                    break;
                case 6:
                    array.selectionSort();
                    break;
                case 7:
                    t = 0;
                    break;
            }
        }
    }
}

