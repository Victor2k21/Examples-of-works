package homeworkTreeMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneContacts contacts = new PhoneContacts();
        MissedCalls missedCalls = new MissedCalls();

        fillContacts(contacts);
        fillMissedCalls(missedCalls);
        System.out.println(
                missedCalls.toString(contacts));
    }

    private static void fillMissedCalls(MissedCalls missedCalls){
        Scanner scanner = new Scanner(System.in);
        String userInput = null;
        while (true){
            System.out.println("Введите номер пропущенного: (или 'end')");
            userInput = scanner.nextLine();
            if ("end".equals(userInput)) return;
            missedCalls.addMissedCall(userInput);
        }
    }

    private static void fillContacts(PhoneContacts contacts) {
        contacts.addContact(new Contact("+22222222222", "Ivan","Romanov"));
        contacts.addContact(new Contact("+22222222233", "Oleg","Klaviatyrov"));
        contacts.addContact(new Contact("+22222222244", "Irina","Sharicov"));
        contacts.addContact(new Contact("+22222222255", "Victor","Byzenov"));
    }
}
