package Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainTwo {
    /**
     * Я попробовал два варианта , один когда ты знаешь какой индекс у числа , и второй вариант
     * что в коллекции Set есть функция удаление одинаковый элементов
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> listNumber = new HashSet<Integer>();
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
    }
}
