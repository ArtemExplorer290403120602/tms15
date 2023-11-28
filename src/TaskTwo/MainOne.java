package TaskTwo;
//Создать класс, который будет хранить в себе коллекцию с названиями животных.
//Реализовать методы удаления и добавления животных по следующим правилам:
//добавляется всегда в конец коллекции, а удаляется всегда из начала. Показать работу
//объекта этого класса в main методе другого класса
public class MainOne {
    public static void main(String[] args) {
    Animal.addAnimal("Псина");
    Animal.addAnimal("Петух");
    Animal.addAnimal("Баран");
    Animal.addAnimal("Крыса");
        System.out.println("--------------------");
    Animal.myCollection();
        System.out.println("--------------------");
    Animal.deleteAnimal();
        System.out.println("--------------------");
    Animal.myCollection();
        System.out.println("--------------------");
    Animal.deleteAnimal();
        System.out.println("--------------------");
    Animal.myCollection();
        System.out.println("--------------------");
    Animal.deleteAnimal();
    Animal.deleteAnimal();
    Animal.deleteAnimal();
    }
}
