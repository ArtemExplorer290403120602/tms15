package TaskTwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
/**
 * Знаю как работает стек : например берем берем патроны в магазине идет по примему FIFO ( Первый пришел, первый ушел
 * Как патроны в магазине первый патрон уходит последним
 */
public class Animal {
    private static Stack<String> listNumber = new Stack<String>();

    public static void addAnimal(String animal) {
        listNumber.add(animal);
        System.out.println("Добавлено животное : " + animal);
    }

    public static void deleteAnimal(){
        if(!listNumber.isEmpty()){
            String animalRemove=listNumber.pop();
            System.out.println("Удалено животное : " + animalRemove);
        }else {
            System.out.println("Коллекиця пуста!!");
        }
    }

    public static void myCollection(){
        System.out.println("Ваша коллекция : " + listNumber);
    }
}
