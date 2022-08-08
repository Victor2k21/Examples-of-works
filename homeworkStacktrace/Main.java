package homeworkStacktrace;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);

    }


    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static User[] getUsers() {
        User user1 = new User("Ahalay", "Mahalay", "AhalayMahalay@mail.ru", 24);
        User user2 = new User("Brayn32", "wasd1234", "netfantazii@gmail.com", 44);
        User user3 = new User("Cake", "keka4321", "Estfantazia@mail.ru", 14);

        return new User[]{user1, user2, user3};
    }
    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Вам нет 18. Доступ запрещен");
        } else {
            System.out.println("Доступ разрешен!");
        }
    }

}