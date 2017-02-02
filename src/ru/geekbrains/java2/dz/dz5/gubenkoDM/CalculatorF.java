package ru.geekbrains.java2.dz.dz5.gubenkoDM;

import java.util.Scanner;

/**
 * Created by Nestor on 07.12.2016.
 */
public class CalculatorF {
    public static void main(String[] args) {
        System.out.println("Привет,пользователь!");
        System.out.println("Тебя приветствует ПО для подсчета количества времени для расчета формулы для эленментов массива значений");
        System.out.println("Введите размерность массива!");
        Scanner sc=new Scanner(System.in);
        long arrSize=sc.nextLong();
        SlowCalker slk=new SlowCalker(arrSize);
        String timeS=new String(slk.calk());
        QuickCalker qlk=new QuickCalker(arrSize);
        String timeQ=new String(qlk.calk());
        System.out.println("Вычисление на примере коллекции из "+arrSize+" элементов");
        System.out.println("1 поток:"+timeS+" мсек");
        System.out.println("2 потока:"+timeQ+" мсек");
    }
}
