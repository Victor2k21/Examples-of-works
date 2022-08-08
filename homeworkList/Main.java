package homeworkList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> toDoList = new ArrayList<>();

        while (true) {
            System.out.println("Выберите действие:\n" + "1. Добавить задачу\n" + "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" + "0. Выход");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
//            int count = 0;

            switch (number) {
                case 1: {
                    System.out.println("Какую задачу хотите добавить? Чтобы добавить введите ниже");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    break;
                }
                case 2: {
                    System.out.println("Ваш текущий список задач: \n");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println(i + ". " + toDoList.get(i) + "\n");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Выберите номер задачи которую хотите удалить: \n");
                    String deletle = scanner.nextLine();
                    int deletleTask = Integer.parseInt(deletle);
                    toDoList.remove(deletleTask);
                    break;
                }
                case 0: {
                    return;
                }
                default:
                    System.out.println("Неверно указано значение");
                    break;
            }
        }
    }
}