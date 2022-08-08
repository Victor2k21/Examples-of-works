package homeworkStore2;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productNumber = 0;
        int productCount = 0;
        int fullPrice = 0;
        String[] products = {"Молоко", "Конфеты", "Картошка", "Банан","Гречка"};
        int[] prices = {85, 600, 180, 110, 120};
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + "." + products[i] + " " + prices[i] + " " + "руб");
        }
        int[] number = new int[products.length];
        int[] sumProducts = new int[products.length];

        while (true) {
            System.out.println("Выберите товар по нумерации и количество,введите значения через 'пробел'" + " " +
                                 "или введите 'end' чтобы закончить: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" ");
            productNumber = Integer.parseInt(parts[0]) - 1;
            productCount = Integer.parseInt(parts[1]);
            int currentPrice = prices[productNumber];
            number[productNumber] += productCount;
            sumProducts[productNumber] += productCount * currentPrice;

        }
        for (int i = 0; i < products.length; i++) {
            if (number[i] > 0) {
                fullPrice += sumProducts[i];
                System.out.println("Наименование:" + " " + products[i] + ";" + " " + "Количество:" + " " + number[i]
                                     + ";" + " " + "Цена за ед. товара:" + " " + prices[i] + " " +
                                    "руб.;" + " " + "Общая стоимость товара:" + " " + sumProducts[i] + "руб.;");
            }
        }
        System.out.println("Общая стоимость:" + " " + fullPrice + " " + "руб" + ";");
    }
}
