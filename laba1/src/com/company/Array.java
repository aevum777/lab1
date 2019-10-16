package com.company;
import java.util.Scanner;

public class Array {
    static int arr[];
    Scanner in = new Scanner(System.in);
    void readArray(int b) {

        arr = new int[b];
        for (int i = 0; i < b; i++) {
            arr[i] = in.nextInt();
        }
    }


    void readArrayRandom(int b)
    {
        arr = new int[b];
        for(int i=0;i < b; i++)
        {
            arr[i] = (int) (Math.random()*(600));
        }

    }
    void printArray()
    {

        for (int element: arr) {
            System.out.println(element);
        }
    }
    public static void printArrayInv()
    {

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void arrayRange()
    {

        int a,c;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число A");
        a = in.nextInt();
        System.out.println("Введите число B");
        c = in.nextInt();

        for(int element : arr) {
            if (a < element & element < c) count++;
        }
        System.out.println("Количество чисел в диапазоне:" + count);
    }
    public static void selectionSort()
    {
        for (int i = 0; i < arr.length; i++)
        {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i)
            {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println("Отсортированный массив чисел:");
        for (int element: arr) {
            System.out.println(element);
        }

    }

}
