package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * // Ввод и обработка строки, если ввели неверное, прошрамма прекращается.
 * // Создать объект FlowerItem
 * //Создаю switch( case ) в качестве параметра СВИТЧ приходит строка ( Цвет ), в качестве КЕЙСОВ, возможные цвета на русском.
 * //Внутри кейса создает объект типа FlowerItem, сетаем соответственный цвет на английском + рандомную цифру
 * // Если тако цвет не найден, создать объект в котором name = unkniwn и цифра -1
 * //Вывод объекта через sout/
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        // write your code here

        System.out.println("Введите строку: ");
        String colorRussia = readLine();

        FlowerItem flowerItem;

        switch (colorRussia.toLowerCase()) {
            case "желтый":
                flowerItem = new FlowerItem("Yellow", getNumber());
                break;
            case "красный":
                flowerItem = new FlowerItem("Red", getNumber());
                break;
            case "синий":
                flowerItem = new FlowerItem("Blue", getNumber());
                break;
            default:
                flowerItem = new FlowerItem("unknown", -1);
        }
        System.out.println(flowerItem);
    }

    public static String readLine() {
        return scanner.nextLine();
    }

    public static int getNumber() {
        return random.nextInt(100);
    }
}
