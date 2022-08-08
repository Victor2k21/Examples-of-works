package homeworkHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneContacts contacts = new PhoneContacts();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите ФИО контакта или 'end' для завершения работы: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            System.out.println("Введите номер контакта: ");
            String put = scanner.nextLine();
            System.out.println("Введите группу контактов: ");
            String kaput = scanner.nextLine();
            contacts.addContact(new Contact(input, put), new String[]{kaput});
        }
        System.out.println(contacts);
    }
}