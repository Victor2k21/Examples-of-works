package homeworkAbstraction;

public class LibrarianAdmin extends User implements Librarian, Administrator {
    public LibrarianAdmin(String name) {
        super(name);
    }

    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + getName() + " уведомляет о нарушении сроков " + reader);
    }
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " заказывает книгу у поставщика " + supplier);
    }
    public void receiveBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName() + " получает книгу у поставщика " + supplier);
    }
}
