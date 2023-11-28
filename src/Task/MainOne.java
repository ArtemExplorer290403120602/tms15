package Task;

import java.util.ArrayList;
import java.util.Scanner;

//Задача 1:
//Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2,
//3, 4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на
//экран. При решении использовать коллекции.
public class MainOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listNumber = new ArrayList<Integer>();
        System.out.print("Введите сколько вы хотите ввести чисел: ");
        final int MAIN_LENGHT_NUMBER = scanner.nextInt();
        int[] naborNumber = new int[MAIN_LENGHT_NUMBER];
        System.out.println("Введите " + MAIN_LENGHT_NUMBER + " чисел(числа) : ");
        for (int i = 0; i < MAIN_LENGHT_NUMBER; i++) {
            System.out.print("Ваше " + "[" + i + "]" + " число " + ": ");
            naborNumber[i] = scanner.nextInt();
        }
        for (int i = 0; i < MAIN_LENGHT_NUMBER; i++) {
            listNumber.add(naborNumber[i]);
        }
        System.out.println("-----------------");
        System.out.println("Ваши числа в коллеции : " + listNumber);
        listNumber.remove(4);
        System.out.println("Ваша новая коллекция : " + listNumber);
    }
}
